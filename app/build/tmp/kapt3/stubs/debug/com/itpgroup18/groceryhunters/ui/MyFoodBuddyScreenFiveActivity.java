package com.itpgroup18.groceryhunters.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\"\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0012\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001aH\u0016J\b\u0010$\u001a\u00020\u001aH\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\u001aH\u0002J\b\u0010)\u001a\u00020\u001aH\u0002J\b\u0010*\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006,"}, d2 = {"Lcom/itpgroup18/groceryhunters/ui/MyFoodBuddyScreenFiveActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/itpgroup18/groceryhunters/databinding/ActivityMyFoodBuddyScreenFiveBinding;", "graphicOverlay", "Lcom/itpgroup18/groceryhunters/GraphicOverlay;", "imageMaxHeight", "", "imageMaxWidth", "imageProcessor", "Lcom/itpgroup18/groceryhunters/VisionImageProcessor;", "imageUri", "Landroid/net/Uri;", "isLandScape", "", "preview", "Landroid/widget/ImageView;", "selectedMode", "", "selectedSize", "targetedWidthHeight", "Lkotlin/Pair;", "getTargetedWidthHeight", "()Lkotlin/Pair;", "createImageProcessor", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onSaveInstanceState", "outState", "startCameraIntentForResult", "startChooseImageIntentForResult", "tryReloadAndDetectInImage", "Companion", "app_debug"})
public final class MyFoodBuddyScreenFiveActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.itpgroup18.groceryhunters.databinding.ActivityMyFoodBuddyScreenFiveBinding binding;
    private android.widget.ImageView preview;
    private com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay;
    private java.lang.String selectedMode = "Object Detection";
    private java.lang.String selectedSize = "w:screen";
    private boolean isLandScape = false;
    private android.net.Uri imageUri;
    private int imageMaxWidth = 0;
    private int imageMaxHeight = 0;
    private com.itpgroup18.groceryhunters.VisionImageProcessor imageProcessor;
    @org.jetbrains.annotations.NotNull()
    public static final com.itpgroup18.groceryhunters.ui.MyFoodBuddyScreenFiveActivity.Companion Companion = null;
    private static final java.lang.String TAG = "StillImageActivity";
    private static final java.lang.String OBJECT_DETECTION = "Object Detection";
    private static final java.lang.String OBJECT_DETECTION_CUSTOM = "Custom Object Detection";
    private static final java.lang.String CUSTOM_AUTOML_OBJECT_DETECTION = "Custom AutoML Object Detection (Flower)";
    private static final java.lang.String FACE_DETECTION = "Face Detection";
    private static final java.lang.String BARCODE_SCANNING = "Barcode Scanning";
    private static final java.lang.String TEXT_RECOGNITION_LATIN = "Text Recognition Latin";
    private static final java.lang.String TEXT_RECOGNITION_CHINESE = "Text Recognition Chinese";
    private static final java.lang.String TEXT_RECOGNITION_DEVANAGARI = "Text Recognition Devanagari";
    private static final java.lang.String TEXT_RECOGNITION_JAPANESE = "Text Recognition Japanese";
    private static final java.lang.String TEXT_RECOGNITION_KOREAN = "Text Recognition Korean";
    private static final java.lang.String IMAGE_LABELING = "Image Labeling";
    private static final java.lang.String IMAGE_LABELING_CUSTOM = "Custom Image Labeling (Birds)";
    private static final java.lang.String CUSTOM_AUTOML_LABELING = "Custom AutoML Image Labeling (Flower)";
    private static final java.lang.String POSE_DETECTION = "Pose Detection";
    private static final java.lang.String SELFIE_SEGMENTATION = "Selfie Segmentation";
    private static final java.lang.String SIZE_SCREEN = "w:screen";
    private static final java.lang.String SIZE_1024_768 = "w:1024";
    private static final java.lang.String SIZE_640_480 = "w:640";
    private static final java.lang.String SIZE_ORIGINAL = "w:original";
    private static final java.lang.String KEY_IMAGE_URI = "com.google.mlkit.vision.demo.KEY_IMAGE_URI";
    private static final java.lang.String KEY_IMAGE_MAX_WIDTH = "com.google.mlkit.vision.demo.KEY_IMAGE_MAX_WIDTH";
    private static final java.lang.String KEY_IMAGE_MAX_HEIGHT = "com.google.mlkit.vision.demo.KEY_IMAGE_MAX_HEIGHT";
    private static final java.lang.String KEY_SELECTED_SIZE = "com.google.mlkit.vision.demo.KEY_SELECTED_SIZE";
    private static final int REQUEST_IMAGE_CAPTURE = 1001;
    private static final int REQUEST_CHOOSE_IMAGE = 1002;
    private java.util.HashMap _$_findViewCache;
    
    public MyFoodBuddyScreenFiveActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void startCameraIntentForResult() {
    }
    
    private final void startChooseImageIntentForResult() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void tryReloadAndDetectInImage() {
    }
    
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> getTargetedWidthHeight() {
        return null;
    }
    
    private final void createImageProcessor() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/itpgroup18/groceryhunters/ui/MyFoodBuddyScreenFiveActivity$Companion;", "", "()V", "BARCODE_SCANNING", "", "CUSTOM_AUTOML_LABELING", "CUSTOM_AUTOML_OBJECT_DETECTION", "FACE_DETECTION", "IMAGE_LABELING", "IMAGE_LABELING_CUSTOM", "KEY_IMAGE_MAX_HEIGHT", "KEY_IMAGE_MAX_WIDTH", "KEY_IMAGE_URI", "KEY_SELECTED_SIZE", "OBJECT_DETECTION", "OBJECT_DETECTION_CUSTOM", "POSE_DETECTION", "REQUEST_CHOOSE_IMAGE", "", "REQUEST_IMAGE_CAPTURE", "SELFIE_SEGMENTATION", "SIZE_1024_768", "SIZE_640_480", "SIZE_ORIGINAL", "SIZE_SCREEN", "TAG", "TEXT_RECOGNITION_CHINESE", "TEXT_RECOGNITION_DEVANAGARI", "TEXT_RECOGNITION_JAPANESE", "TEXT_RECOGNITION_KOREAN", "TEXT_RECOGNITION_LATIN", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}