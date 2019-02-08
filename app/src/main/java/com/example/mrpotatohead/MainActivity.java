package com.example.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    ImageView hatImage;
    ImageView earsImage;
    ImageView armsImage;
    ImageView noseImage;
    ImageView glassesImage;
    ImageView shoesImage;
    ImageView mouthimage;
    ImageView mustacheImage;
    ImageView eyesImage;
    ImageView eyebrowsImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hatImage = (ImageView) findViewById(R.id.imageViewHat);
        earsImage = (ImageView) findViewById(R.id.imageViewEars);
        armsImage = (ImageView) findViewById(R.id.imageViewArms);
        noseImage = (ImageView) findViewById(R.id.imageViewNose);
        glassesImage = (ImageView) findViewById(R.id.imageViewGlasses);
        shoesImage = (ImageView) findViewById(R.id.imageViewShoes);
        mouthimage = (ImageView) findViewById(R.id.imageViewMouth);
        mustacheImage = (ImageView) findViewById(R.id.imageViewMustache);
        eyesImage = (ImageView) findViewById(R.id.imageViewEyes);
        eyebrowsImage = (ImageView) findViewById(R.id.imageViewEyebrows);


    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("Hat", hatImage.getVisibility());
        outState.putInt("Ears", earsImage.getVisibility());
        outState.putInt("Arms", armsImage.getVisibility());
        outState.putInt("Nose", noseImage.getVisibility());
        outState.putInt("Glasses", glassesImage.getVisibility());
        outState.putInt("Shoes", shoesImage.getVisibility());
        outState.putInt("Mouth", mouthimage.getVisibility());
        outState.putInt("Mustache", mustacheImage.getVisibility());
        outState.putInt("Eyes", eyesImage.getVisibility());
        outState.putInt("Eyebrows", eyebrowsImage.getVisibility());

    }

    @Override
    protected void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        hatImage.setVisibility(inState.getInt("Hat"));
        earsImage.setVisibility(inState.getInt("Ears"));
        armsImage.setVisibility(inState.getInt("Arms"));
        noseImage.setVisibility(inState.getInt("Nose"));
        glassesImage.setVisibility(inState.getInt("Glasses"));
        shoesImage.setVisibility(inState.getInt("Shoes"));
        mouthimage.setVisibility(inState.getInt("Mouth"));
        mustacheImage.setVisibility(inState.getInt("Mustache"));
        eyesImage.setVisibility(inState.getInt("Eyes"));
        eyebrowsImage.setVisibility(inState.getInt("Eyebrows"));

    }





    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBoxEyebrows:
                if (checked){
                    // make visible
                    eyebrowsImage.setVisibility(View.VISIBLE);
                }
            else {
                    // make invisible
                    eyebrowsImage.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEyes:
                if (checked){
                    eyesImage.setVisibility(View.VISIBLE);
                }
            else{
                eyesImage.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEars:
                if (checked){
                    earsImage.setVisibility(view.VISIBLE);
                }
            else{
                earsImage.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxShoes:
                if (checked){
                    shoesImage.setVisibility(view.VISIBLE);
                }
            else{
                shoesImage.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxMouth:
                ImageView mouthImage = findViewById(R.id.imageViewMouth);
                if (checked){
                    mouthImage.setVisibility(view.VISIBLE);
                }
            else{
                mouthImage.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxMustache:
                if (checked){
                    mustacheImage.setVisibility(view.VISIBLE);
                }
            else{
                mustacheImage.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxNose:
                if (checked){
                    noseImage.setVisibility(view.VISIBLE);
                }
            else{
                noseImage.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxGlasses:
                if (checked){
                    glassesImage.setVisibility(view.VISIBLE);
                }
            else{
                glassesImage.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxArms:
                if (checked){
                    armsImage.setVisibility(view.VISIBLE);
                }
            else{
                armsImage.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxHat:
                if (checked){
                    hatImage.setVisibility(view.VISIBLE);
                }
            else{
                hatImage.setVisibility(View.INVISIBLE);
                }
                break;

        }
    }
}
