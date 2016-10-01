package com.example.pabrunts15.tts_test2;

        import java.util.Locale;
        import android.app.Activity;
        import android.os.Bundle;
        import android.speech.tts.TextToSpeech;
        import android.widget.Button;
        import android.widget.EditText;


public class MainActivity extends Activity implements
        TextToSpeech.OnInitListener {
    /** Called when the activity is first created. */

    private TextToSpeech tts;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tts = new TextToSpeech(this, this);
    }


    @Override
   public void onInit(int status) {
        int result = tts.setLanguage(Locale.US);
        String text1 = "What is your destination";
        speakOut(text1);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String text2 = "Is this the correct address";
        speakOut(text2);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tryingthings();
        }


    public void tryingthings() {
        String text3 = "This comes from another function";
        speakOut(text3);
    }

    private void speakOut(String text) {
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }


}
