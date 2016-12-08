package none.cminstrument;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import org.billthefarmer.mididriver.MidiDriver;
import org.jfugue.Player;

import jp.kshoji.javax.sound.midi.MetaEventListener;
import jp.kshoji.javax.sound.midi.MetaMessage;
import jp.kshoji.javax.sound.midi.UsbMidiSystem;

public class MainActivity extends AppCompatActivity implements MidiDriver.OnMidiStartListener, View.OnTouchListener{
    private MidiDriver midiDriver;
    private byte[] event;
    private int[] config;
    private ImageButton buttonPlayNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlayNote = (ImageButton)findViewById(R.id.C1);
        buttonPlayNote.setOnTouchListener(this);

        // Instantiate the driver.
        midiDriver = new MidiDriver();
        // Set the listener.
        midiDriver.setOnMidiStartListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        midiDriver.start();

        // Get the configuration.
        config = midiDriver.config();

        // Print out the details.
        Log.d(this.getClass().getName(), "maxVoices: " + config[0]);
        Log.d(this.getClass().getName(), "numChannels: " + config[1]);
        Log.d(this.getClass().getName(), "sampleRate: " + config[2]);
        Log.d(this.getClass().getName(), "mixBufferSize: " + config[3]);
    }

    @Override
    protected void onPause() {
        super.onPause();
        midiDriver.stop();
    }

    @Override
    public void onMidiStart() {
        Log.d(this.getClass().getName(), "onMidiStart()");
    }

    private void playNote() {

        // Construct a note ON message for the middle C at maximum velocity on channel 1:
        event = new byte[3];
        event[0] = (byte) (0x90);  // 0x90 = note On, 0x00 = channel 1
        event[1] = (byte) 0x3C;  // 0x3C = middle C
        event[2] = (byte) 0x7F;  // 0x7F = the maximum velocity (127)

        // Internally this just calls write() and can be considered obsoleted:
        //midiDriver.queueEvent(event);

        // Send the MIDI event to the synthesizer.
        midiDriver.write(event);

    }

    private void stopNote() {

        // Construct a note OFF message for the middle C at minimum velocity on channel 1:
        event = new byte[3];
        event[0] = (byte) (0x80);  // 0x80 = note Off, 0x00 = channel 1
        event[1] = (byte) 0x3C;  // 0x3C = middle C
        event[2] = (byte) 0x00;  // 0x00 = the minimum velocity (0)

        // Send the MIDI event to the synthesizer.
        midiDriver.write(event);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        Log.d(this.getClass().getName(), "Motion event: " + event);

        if (v.getId() == R.id.C1) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                playNote();
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {
                Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                stopNote();
            }
        }

        return false;
    }
}
