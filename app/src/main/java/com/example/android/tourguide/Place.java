package com.example.android.tourguide;

/**
 * {@link Place} represents a place in Warsaw (Poland).
 * It contains a default translation, a polish translation, and an image for that place.
 */
public class Place {

    /** Default translation for that place. */
    private String mDefaultTranslation;

    /** Polish translation for that place */
    private String mPolishTranslation;

    /** Image resource id for that place */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param polishTranslation is the word in the Polish language
     */
    public Place(String defaultTranslation, String polishTranslation){
        mDefaultTranslation = defaultTranslation;
        mPolishTranslation = polishTranslation;
    }

    /**
     * Create a new Place object.
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param polishTranslation is the word in the Polish language
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     */
    public Place(String defaultTranslation, String polishTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mPolishTranslation = polishTranslation;
        mImageResourceId = imageResourceId;
    }

    /** Get the default translation of the place */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /** Get polish translation of the place */
    public String getPolishTranslation(){
        return mPolishTranslation;
    }

    /** Get drawable resource ID for the image associated with the place */
    public int getImageResourceId(){
        return mImageResourceId;
    }
}
