package com.saktyneo.thenoungame;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Safal on 25-07-2015.
 */
public class NewGameActivity extends Activity implements View.OnClickListener {

    Button btnSubmit;
    TextView txtLost, txtLostNumber, txtWon, txtWonNumber, txtScore, txtScoreNumber;
    TextView txtPerson, txtPlace, txtThing, txtAnimal;
    EditText editorPerson, editorPlace, editorThing, editorAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newgame);

        // Font path
        String fontPath = "fonts/SHOWG.TTF";
        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        // text view label
        txtLost = (TextView) findViewById(R.id.txtLost);
        txtLostNumber = (TextView) findViewById(R.id.txtLostNumber);
        txtWon = (TextView) findViewById(R.id.txtWon);
        txtWonNumber = (TextView) findViewById(R.id.txtWonNumber);
        txtScore = (TextView) findViewById(R.id.txtScore);
        txtScoreNumber = (TextView) findViewById(R.id.txtScoreNumber);

        txtPerson = (TextView) findViewById(R.id.txtPerson);
        txtPlace = (TextView) findViewById(R.id.txtPlace);
        txtThing = (TextView) findViewById(R.id.txtThing);
        txtAnimal = (TextView) findViewById(R.id.txtAnimal);

        // edit view label
        editorPerson = (EditText) findViewById(R.id.editorPerson);
        editorPlace = (EditText) findViewById(R.id.editorPlace);
        editorThing = (EditText) findViewById(R.id.editorThing);
        editorAnimal = (EditText) findViewById(R.id.editorAnimal);

        // Applying font
        txtLost.setTypeface(tf);
        txtLostNumber.setTypeface(tf);
        txtWon.setTypeface(tf);
        txtWonNumber.setTypeface(tf);
        txtScore.setTypeface(tf);
        txtScoreNumber.setTypeface(tf);

        txtPerson.setTypeface(tf);
        txtPlace.setTypeface(tf);
        txtThing.setTypeface(tf);
        txtAnimal.setTypeface(tf);

        editorPerson.setTypeface(tf);
        editorPlace.setTypeface(tf);
        editorThing.setTypeface(tf);
        editorAnimal.setTypeface(tf);

        // assign Listeners
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        // do stuff for button New Game
        Intent i = new Intent(this, SubmitActivity.class);
        startActivity(i);
    }
}
