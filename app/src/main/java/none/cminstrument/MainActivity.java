package none.cminstrument;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import org.billthefarmer.mididriver.MidiDriver;

import jp.kshoji.javax.sound.midi.Sequencer;

public class MainActivity extends AppCompatActivity implements MidiDriver.OnMidiStartListener, View.OnTouchListener{
    private MidiDriver midiDriver;
    protected MediaPlayer player;
    private int[] config;

    //1st octave
    private ImageButton C1;
    private ImageButton Csharp1;
    private ImageButton D1;
    private ImageButton Dsharp1;
    private ImageButton E1;
    private ImageButton F1;
    private ImageButton Fsharp1;
    private ImageButton G1;
    private ImageButton Gsharp1;
    private ImageButton A1;
    private ImageButton Asharp1;
    private ImageButton B1;

    //2nd octave
    private ImageButton C2;
    private ImageButton Csharp2;
    private ImageButton D2;
    private ImageButton Dsharp2;
    private ImageButton E2;
    private ImageButton F2;
    private ImageButton Fsharp2;
    private ImageButton G2;
    private ImageButton Gsharp2;
    private ImageButton A2;
    private ImageButton Asharp2;
    private ImageButton B2;

    //3rd octave
    private ImageButton C3;
    private ImageButton Csharp3;
    private ImageButton D3;
    private ImageButton Dsharp3;
    private ImageButton E3;
    private ImageButton F3;
    private ImageButton Fsharp3;
    private ImageButton G3;
    private ImageButton Gsharp3;
    private ImageButton A3;
    private ImageButton Asharp3;
    private ImageButton B3;

    //4th octave
    private ImageButton C4;
    private ImageButton Csharp4;
    private ImageButton D4;
    private ImageButton Dsharp4;
    private ImageButton E4;
    private ImageButton F4;
    private ImageButton Fsharp4;
    private ImageButton G4;
    private ImageButton Gsharp4;
    private ImageButton A4;
    private ImageButton Asharp4;
    private ImageButton B4;

    //5th octave
    private ImageButton C5;
    private ImageButton Csharp5;
    private ImageButton D5;
    private ImageButton Dsharp5;
    private ImageButton E5;
    private ImageButton F5;
    private ImageButton Fsharp5;
    private ImageButton G5;
    private ImageButton Gsharp5;
    private ImageButton A5;
    private ImageButton Asharp5;
    private ImageButton B5;

    //6th octave
    private ImageButton C6;
    private ImageButton Csharp6;
    private ImageButton D6;
    private ImageButton Dsharp6;
    private ImageButton E6;
    private ImageButton F6;
    private ImageButton Fsharp6;
    private ImageButton G6;
    private ImageButton Gsharp6;
    private ImageButton A6;
    private ImageButton Asharp6;
    private ImageButton B6;

    private ImageButton buttonPlayNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1st octave
        C1 = (ImageButton)findViewById(R.id.C1);
        C1.setOnTouchListener(this);
        Csharp1 = (ImageButton)findViewById(R.id.Csharp1);
        Csharp1.setOnTouchListener(this);
        D1 = (ImageButton)findViewById(R.id.D1);
        D1.setOnTouchListener(this);
        Dsharp1 = (ImageButton)findViewById(R.id.Dsharp1);
        Dsharp1.setOnTouchListener(this);
        E1 = (ImageButton)findViewById(R.id.E1);
        E1.setOnTouchListener(this);
        F1 = (ImageButton)findViewById(R.id.F1);
        F1.setOnTouchListener(this);
        Fsharp1 = (ImageButton)findViewById(R.id.Fsharp1);
        Fsharp1.setOnTouchListener(this);
        G1 = (ImageButton)findViewById(R.id.G1);
        G1.setOnTouchListener(this);
        Gsharp1 = (ImageButton)findViewById(R.id.Gsharp1);
        Gsharp1.setOnTouchListener(this);
        A1 = (ImageButton)findViewById(R.id.A1);
        A1.setOnTouchListener(this);
        Asharp1 = (ImageButton)findViewById(R.id.Asharp1);
        Asharp1.setOnTouchListener(this);
        B1 = (ImageButton)findViewById(R.id.B1);
        B1.setOnTouchListener(this);

        //2nd octave
        C2 = (ImageButton)findViewById(R.id.C2);
        C2.setOnTouchListener(this);
        Csharp2 = (ImageButton)findViewById(R.id.Csharp2);
        Csharp2.setOnTouchListener(this);
        D2 = (ImageButton)findViewById(R.id.D2);
        D2.setOnTouchListener(this);
        Dsharp2 = (ImageButton)findViewById(R.id.Dsharp2);
        Dsharp2.setOnTouchListener(this);
        E2 = (ImageButton)findViewById(R.id.E2);
        E2.setOnTouchListener(this);
        F2 = (ImageButton)findViewById(R.id.F2);
        F2.setOnTouchListener(this);
        Fsharp2 = (ImageButton)findViewById(R.id.Fsharp2);
        Fsharp2.setOnTouchListener(this);
        G2 = (ImageButton)findViewById(R.id.G2);
        G2.setOnTouchListener(this);
        Gsharp2 = (ImageButton)findViewById(R.id.Gsharp2);
        Gsharp2.setOnTouchListener(this);
        A2 = (ImageButton)findViewById(R.id.A2);
        A2.setOnTouchListener(this);
        Asharp2 = (ImageButton)findViewById(R.id.Asharp2);
        Asharp2.setOnTouchListener(this);
        B2 = (ImageButton)findViewById(R.id.B2);
        B2.setOnTouchListener(this);

        //3rd octave
        C3 = (ImageButton)findViewById(R.id.C3);
        C3.setOnTouchListener(this);
        Csharp3 = (ImageButton)findViewById(R.id.Csharp3);
        Csharp3.setOnTouchListener(this);
        D3 = (ImageButton)findViewById(R.id.D3);
        D3.setOnTouchListener(this);
        Dsharp3 = (ImageButton)findViewById(R.id.Dsharp3);
        Dsharp3.setOnTouchListener(this);
        E3 = (ImageButton)findViewById(R.id.E3);
        E3.setOnTouchListener(this);
        F3 = (ImageButton)findViewById(R.id.F3);
        F3.setOnTouchListener(this);
        Fsharp3 = (ImageButton)findViewById(R.id.Fsharp3);
        Fsharp3.setOnTouchListener(this);
        G3 = (ImageButton)findViewById(R.id.G3);
        G3.setOnTouchListener(this);
        Gsharp3 = (ImageButton)findViewById(R.id.Gsharp3);
        Gsharp3.setOnTouchListener(this);
        A3 = (ImageButton)findViewById(R.id.A3);
        A3.setOnTouchListener(this);
        Asharp3 = (ImageButton)findViewById(R.id.Asharp3);
        Asharp3.setOnTouchListener(this);
        B3 = (ImageButton)findViewById(R.id.B3);
        B3.setOnTouchListener(this);

        //4th octave
        C4 = (ImageButton)findViewById(R.id.C4);
        C4.setOnTouchListener(this);
        Csharp4 = (ImageButton)findViewById(R.id.Csharp4);
        Csharp4.setOnTouchListener(this);
        D4 = (ImageButton)findViewById(R.id.D4);
        D4.setOnTouchListener(this);
        Dsharp4 = (ImageButton)findViewById(R.id.Dsharp4);
        Dsharp4.setOnTouchListener(this);
        E4 = (ImageButton)findViewById(R.id.E4);
        E4.setOnTouchListener(this);
        F4 = (ImageButton)findViewById(R.id.F4);
        F4.setOnTouchListener(this);
        Fsharp4 = (ImageButton)findViewById(R.id.Fsharp4);
        Fsharp4.setOnTouchListener(this);
        G4 = (ImageButton)findViewById(R.id.G4);
        G4.setOnTouchListener(this);
        Gsharp4 = (ImageButton)findViewById(R.id.Gsharp4);
        Gsharp4.setOnTouchListener(this);
        A4 = (ImageButton)findViewById(R.id.A4);
        A4.setOnTouchListener(this);
        Asharp4 = (ImageButton)findViewById(R.id.Asharp4);
        Asharp4.setOnTouchListener(this);
        B4 = (ImageButton)findViewById(R.id.B4);
        B4.setOnTouchListener(this);

        //5th octave
        C5 = (ImageButton)findViewById(R.id.C5);
        C5.setOnTouchListener(this);
        Csharp5 = (ImageButton)findViewById(R.id.Csharp5);
        Csharp5.setOnTouchListener(this);
        D5 = (ImageButton)findViewById(R.id.D5);
        D5.setOnTouchListener(this);
        Dsharp5 = (ImageButton)findViewById(R.id.Dsharp5);
        Dsharp5.setOnTouchListener(this);
        E5 = (ImageButton)findViewById(R.id.E5);
        E5.setOnTouchListener(this);
        F5 = (ImageButton)findViewById(R.id.F5);
        F5.setOnTouchListener(this);
        Fsharp5 = (ImageButton)findViewById(R.id.Fsharp5);
        Fsharp5.setOnTouchListener(this);
        G5 = (ImageButton)findViewById(R.id.G5);
        G5.setOnTouchListener(this);
        Gsharp5 = (ImageButton)findViewById(R.id.Gsharp5);
        Gsharp5.setOnTouchListener(this);
        A5 = (ImageButton)findViewById(R.id.A5);
        A5.setOnTouchListener(this);
        Asharp5 = (ImageButton)findViewById(R.id.Asharp5);
        Asharp5.setOnTouchListener(this);
        B5 = (ImageButton)findViewById(R.id.B5);
        B5.setOnTouchListener(this);

        //6th octave
        C6 = (ImageButton)findViewById(R.id.C6);
        C6.setOnTouchListener(this);
        Csharp6 = (ImageButton)findViewById(R.id.Csharp6);
        Csharp6.setOnTouchListener(this);
        D6 = (ImageButton)findViewById(R.id.D6);
        D6.setOnTouchListener(this);
        Dsharp6 = (ImageButton)findViewById(R.id.Dsharp6);
        Dsharp6.setOnTouchListener(this);
        E6 = (ImageButton)findViewById(R.id.E6);
        E6.setOnTouchListener(this);
        F6 = (ImageButton)findViewById(R.id.F6);
        F6.setOnTouchListener(this);
        Fsharp6 = (ImageButton)findViewById(R.id.Fsharp6);
        Fsharp6.setOnTouchListener(this);
        G6 = (ImageButton)findViewById(R.id.G6);
        G6.setOnTouchListener(this);
        Gsharp6 = (ImageButton)findViewById(R.id.Gsharp6);
        Gsharp6.setOnTouchListener(this);
        A6 = (ImageButton)findViewById(R.id.A6);
        A6.setOnTouchListener(this);
        Asharp6 = (ImageButton)findViewById(R.id.Asharp6);
        Asharp6.setOnTouchListener(this);
        B6 = (ImageButton)findViewById(R.id.B6);
        B6.setOnTouchListener(this);

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
        // Stop midi

        if (midiDriver != null)
            midiDriver.stop();

        // Stop player

        if (player != null)
            player.stop();
    }

    @Override
    public void onMidiStart() {
        // Program change - harpsicord

        sendMidi(0xc0, 16);

        // Get the config

        int config[] = midiDriver.config();
        String format =
                "maxVoices = %d\nnumChannels = %d\n" +
                        "sampleRate = %d\nmixBufferSize = %d";

    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {

        int action = event.getAction();
        int id = v.getId();

        switch (action)
        {
            // Down

            case MotionEvent.ACTION_DOWN:
                switch (id)
                {
                    // 1st octave
                    case R.id.C1:
                        sendMidi(0x90, 24, 63);
                        break;
                    case R.id.Csharp1:
                        sendMidi(0x90, 25, 63);
                        break;
                    case R.id.D1:
                        sendMidi(0x90, 26, 63);
                        break;
                    case R.id.Dsharp1:
                        sendMidi(0x90, 27, 63);
                        break;
                    case R.id.E1:
                        sendMidi(0x90, 28, 63);
                        break;
                    case R.id.F1:
                        sendMidi(0x90, 29, 63);
                        break;
                    case R.id.Fsharp1:
                        sendMidi(0x90, 30, 63);
                        break;
                    case R.id.G1:
                        sendMidi(0x90, 31, 63);
                        break;
                    case R.id.Gsharp1:
                        sendMidi(0x90, 32, 63);
                        break;
                    case R.id.A1:
                        sendMidi(0x90, 33, 63);
                        break;
                    case R.id.Asharp1:
                        sendMidi(0x90, 34, 63);
                        break;
                    case R.id.B1:
                        sendMidi(0x90, 35, 63);
                        break;

                    // 2nd octave
                    case R.id.C2:
                        sendMidi(0x90, 36, 63);
                        break;
                    case R.id.Csharp2:
                        sendMidi(0x90, 37, 63);
                        break;
                    case R.id.D2:
                        sendMidi(0x90, 38, 63);
                        break;
                    case R.id.Dsharp2:
                        sendMidi(0x90, 39, 63);
                        break;
                    case R.id.E2:
                        sendMidi(0x90, 40, 63);
                        break;
                    case R.id.F2:
                        sendMidi(0x90, 41, 63);
                        break;
                    case R.id.Fsharp2:
                        sendMidi(0x90, 42, 63);
                        break;
                    case R.id.G2:
                        sendMidi(0x90, 43, 63);
                        break;
                    case R.id.Gsharp2:
                        sendMidi(0x90, 44, 63);
                        break;
                    case R.id.A2:
                        sendMidi(0x90, 45, 63);
                        break;
                    case R.id.Asharp2:
                        sendMidi(0x90, 46, 63);
                        break;
                    case R.id.B2:
                        sendMidi(0x90, 47, 63);
                        break;

                    // 3rd octave
                    case R.id.C3:
                        sendMidi(0x90, 48, 63);
                        break;
                    case R.id.Csharp3:
                        sendMidi(0x90, 49, 63);
                        break;
                    case R.id.D3:
                        sendMidi(0x90, 50, 63);
                        break;
                    case R.id.Dsharp3:
                        sendMidi(0x90, 51, 63);
                        break;
                    case R.id.E3:
                        sendMidi(0x90, 52, 63);
                        break;
                    case R.id.F3:
                        sendMidi(0x90, 53, 63);
                        break;
                    case R.id.Fsharp3:
                        sendMidi(0x90, 54, 63);
                        break;
                    case R.id.G3:
                        sendMidi(0x90, 55, 63);
                        break;
                    case R.id.Gsharp3:
                        sendMidi(0x90, 56, 63);
                        break;
                    case R.id.A3:
                        sendMidi(0x90, 57, 63);
                        break;
                    case R.id.Asharp3:
                        sendMidi(0x90, 58, 63);
                        break;
                    case R.id.B3:
                        sendMidi(0x90, 59, 63);
                        break;

                    // 4th octave
                    case R.id.C4:
                        sendMidi(0x90, 60, 63);
                        break;
                    case R.id.Csharp4:
                        sendMidi(0x90, 61, 63);
                        break;
                    case R.id.D4:
                        sendMidi(0x90, 62, 63);
                        break;
                    case R.id.Dsharp4:
                        sendMidi(0x90, 63, 63);
                        break;
                    case R.id.E4:
                        sendMidi(0x90, 64, 63);
                        break;
                    case R.id.F4:
                        sendMidi(0x90, 65, 63);
                        break;
                    case R.id.Fsharp4:
                        sendMidi(0x90, 66, 63);
                        break;
                    case R.id.G4:
                        sendMidi(0x90, 67, 63);
                        break;
                    case R.id.Gsharp4:
                        sendMidi(0x90, 68, 63);
                        break;
                    case R.id.A4:
                        sendMidi(0x90, 69, 63);
                        break;
                    case R.id.Asharp4:
                        sendMidi(0x90, 70, 63);
                        break;
                    case R.id.B4:
                        sendMidi(0x90, 71, 63);
                        break;

                    // 5th octave
                    case R.id.C5:
                        sendMidi(0x90, 72, 63);
                        break;
                    case R.id.Csharp5:
                        sendMidi(0x90, 73, 63);
                        break;
                    case R.id.D5:
                        sendMidi(0x90, 74, 63);
                        break;
                    case R.id.Dsharp5:
                        sendMidi(0x90, 75, 63);
                        break;
                    case R.id.E5:
                        sendMidi(0x90, 76, 63);
                        break;
                    case R.id.F5:
                        sendMidi(0x90, 77, 63);
                        break;
                    case R.id.Fsharp5:
                        sendMidi(0x90, 78, 63);
                        break;
                    case R.id.G5:
                        sendMidi(0x90, 79, 63);
                        break;
                    case R.id.Gsharp5:
                        sendMidi(0x90, 80, 63);
                        break;
                    case R.id.A5:
                        sendMidi(0x90, 81, 63);
                        break;
                    case R.id.Asharp5:
                        sendMidi(0x90, 82, 63);
                        break;
                    case R.id.B5:
                        sendMidi(0x90, 83, 63);
                        break;

                    // 6th octave
                    case R.id.C6:
                        sendMidi(0x90, 84, 63);
                        break;
                    case R.id.Csharp6:
                        sendMidi(0x90, 85, 63);
                        break;
                    case R.id.D6:
                        sendMidi(0x90, 86, 63);
                        break;
                    case R.id.Dsharp6:
                        sendMidi(0x90, 87, 63);
                        break;
                    case R.id.E6:
                        sendMidi(0x90, 88, 63);
                        break;
                    case R.id.F6:
                        sendMidi(0x90, 89, 63);
                        break;
                    case R.id.Fsharp6:
                        sendMidi(0x90, 90, 63);
                        break;
                    case R.id.G6:
                        sendMidi(0x90, 91, 63);
                        break;
                    case R.id.Gsharp6:
                        sendMidi(0x90, 92, 63);
                        break;
                    case R.id.A6:
                        sendMidi(0x90, 93, 63);
                        break;
                    case R.id.Asharp6:
                        sendMidi(0x90, 94, 63);
                        break;
                    case R.id.B6:
                        sendMidi(0x90, 95, 63);
                        break;

                    default:
                        return false;
                }
                break;

            // Up

            case MotionEvent.ACTION_UP:
                switch (id)
                {
                    // 1st octave
                    case R.id.C1:
                        sendMidi(0x90, 24, 0);
                        break;
                    case R.id.Csharp1:
                        sendMidi(0x90, 25, 0);
                        break;
                    case R.id.D1:
                        sendMidi(0x90, 26, 0);
                        break;
                    case R.id.Dsharp1:
                        sendMidi(0x90, 27, 0);
                        break;
                    case R.id.E1:
                        sendMidi(0x90, 28, 0);
                        break;
                    case R.id.F1:
                        sendMidi(0x90, 29, 0);
                        break;
                    case R.id.Fsharp1:
                        sendMidi(0x90, 30, 0);
                        break;
                    case R.id.G1:
                        sendMidi(0x90, 31, 0);
                        break;
                    case R.id.Gsharp1:
                        sendMidi(0x90, 32, 0);
                        break;
                    case R.id.A1:
                        sendMidi(0x90, 33, 0);
                        break;
                    case R.id.Asharp1:
                        sendMidi(0x90, 34, 0);
                        break;
                    case R.id.B1:
                        sendMidi(0x90, 35, 0);
                        break;

                    // 2nd octave
                    case R.id.C2:
                        sendMidi(0x90, 36, 0);
                        break;
                    case R.id.Csharp2:
                        sendMidi(0x90, 37, 0);
                        break;
                    case R.id.D2:
                        sendMidi(0x90, 38, 0);
                        break;
                    case R.id.Dsharp2:
                        sendMidi(0x90, 39, 0);
                        break;
                    case R.id.E2:
                        sendMidi(0x90, 40, 0);
                        break;
                    case R.id.F2:
                        sendMidi(0x90, 41, 0);
                        break;
                    case R.id.Fsharp2:
                        sendMidi(0x90, 42, 0);
                        break;
                    case R.id.G2:
                        sendMidi(0x90, 43, 0);
                        break;
                    case R.id.Gsharp2:
                        sendMidi(0x90, 44, 0);
                        break;
                    case R.id.A2:
                        sendMidi(0x90, 45, 0);
                        break;
                    case R.id.Asharp2:
                        sendMidi(0x90, 46, 0);
                        break;
                    case R.id.B2:
                        sendMidi(0x90, 47, 0);
                        break;

                    // 3rd octave
                    case R.id.C3:
                        sendMidi(0x90, 48, 0);
                        break;
                    case R.id.Csharp3:
                        sendMidi(0x90, 49, 0);
                        break;
                    case R.id.D3:
                        sendMidi(0x90, 50, 0);
                        break;
                    case R.id.Dsharp3:
                        sendMidi(0x90, 51, 0);
                        break;
                    case R.id.E3:
                        sendMidi(0x90, 52, 0);
                        break;
                    case R.id.F3:
                        sendMidi(0x90, 53, 0);
                        break;
                    case R.id.Fsharp3:
                        sendMidi(0x90, 54, 0);
                        break;
                    case R.id.G3:
                        sendMidi(0x90, 55, 0);
                        break;
                    case R.id.Gsharp3:
                        sendMidi(0x90, 56, 0);
                        break;
                    case R.id.A3:
                        sendMidi(0x90, 57, 0);
                        break;
                    case R.id.Asharp3:
                        sendMidi(0x90, 58, 0);
                        break;
                    case R.id.B3:
                        sendMidi(0x90, 59, 0);
                        break;

                    // 4th octave
                    case R.id.C4:
                        sendMidi(0x90, 60, 0);
                        break;
                    case R.id.Csharp4:
                        sendMidi(0x90, 61, 0);
                        break;
                    case R.id.D4:
                        sendMidi(0x90, 62, 0);
                        break;
                    case R.id.Dsharp4:
                        sendMidi(0x90, 63, 0);
                        break;
                    case R.id.E4:
                        sendMidi(0x90, 64, 0);
                        break;
                    case R.id.F4:
                        sendMidi(0x90, 65, 0);
                        break;
                    case R.id.Fsharp4:
                        sendMidi(0x90, 66, 0);
                        break;
                    case R.id.G4:
                        sendMidi(0x90, 67, 0);
                        break;
                    case R.id.Gsharp4:
                        sendMidi(0x90, 68, 0);
                        break;
                    case R.id.A4:
                        sendMidi(0x90, 69, 0);
                        break;
                    case R.id.Asharp4:
                        sendMidi(0x90, 70, 0);
                        break;
                    case R.id.B4:
                        sendMidi(0x90, 71, 0);
                        break;

                    // 5th octave
                    case R.id.C5:
                        sendMidi(0x90, 72, 0);
                        break;
                    case R.id.Csharp5:
                        sendMidi(0x90, 73, 0);
                        break;
                    case R.id.D5:
                        sendMidi(0x90, 74, 0);
                        break;
                    case R.id.Dsharp5:
                        sendMidi(0x90, 75, 0);
                        break;
                    case R.id.E5:
                        sendMidi(0x90, 76, 0);
                        break;
                    case R.id.F5:
                        sendMidi(0x90, 77, 0);
                        break;
                    case R.id.Fsharp5:
                        sendMidi(0x90, 78, 0);
                        break;
                    case R.id.G5:
                        sendMidi(0x90, 79, 0);
                        break;
                    case R.id.Gsharp5:
                        sendMidi(0x90, 80, 0);
                        break;
                    case R.id.A5:
                        sendMidi(0x90, 81, 0);
                        break;
                    case R.id.Asharp5:
                        sendMidi(0x90, 82, 0);
                        break;
                    case R.id.B5:
                        sendMidi(0x90, 83, 0);
                        break;

                    // 6th octave
                    case R.id.C6:
                        sendMidi(0x90, 84, 0);
                        break;
                    case R.id.Csharp6:
                        sendMidi(0x90, 85, 0);
                        break;
                    case R.id.D6:
                        sendMidi(0x90, 86, 0);
                        break;
                    case R.id.Dsharp6:
                        sendMidi(0x90, 87, 0);
                        break;
                    case R.id.E6:
                        sendMidi(0x90, 88, 0);
                        break;
                    case R.id.F6:
                        sendMidi(0x90, 89, 0);
                        break;
                    case R.id.Fsharp6:
                        sendMidi(0x90, 90, 0);
                        break;
                    case R.id.G6:
                        sendMidi(0x90, 91, 0);
                        break;
                    case R.id.Gsharp6:
                        sendMidi(0x90, 92, 0);
                        break;
                    case R.id.A6:
                        sendMidi(0x90, 93, 0);
                        break;
                    case R.id.Asharp6:
                        sendMidi(0x90, 94, 0);
                        break;
                    case R.id.B6:
                        sendMidi(0x90, 95, 0);
                        break;

                    default:
                        return false;
                }
                break;

            default:
                return false;
        }

        return false;
    }



    // Send a midi message

    protected void sendMidi(int m, int p)
    {
        byte msg[] = new byte[2];

        msg[0] = (byte) m;
        msg[1] = (byte) p;

        midiDriver.write(msg);
    }

    // Send a midi message

    protected void sendMidi(int m, int n, int v)
    {
        byte msg[] = new byte[3];

        msg[0] = (byte) m;
        msg[1] = (byte) n;
        msg[2] = (byte) v;

        midiDriver.write(msg);
    }
}
