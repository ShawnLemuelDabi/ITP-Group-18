package com.google.mlkit.vision.demo.kotlin.textdetector;

import java.lang.System;

/**
 * Processor for the text detector demo.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0014\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/google/mlkit/vision/demo/kotlin/textdetector/TextRecognitionProcessor;", "Lcom/itpgroup18/groceryhunters/VisionProcessorBase;", "Lcom/google/mlkit/vision/text/Text;", "context", "Landroid/content/Context;", "textRecognizerOptions", "Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;", "(Landroid/content/Context;Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;)V", "shouldGroupRecognizedTextInBlocks", "", "showLanguageTag", "textRecognizer", "Lcom/google/mlkit/vision/text/TextRecognizer;", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "text", "graphicOverlay", "Lcom/itpgroup18/groceryhunters/GraphicOverlay;", "stop", "Companion", "app_debug"})
public final class TextRecognitionProcessor extends com.itpgroup18.groceryhunters.VisionProcessorBase<com.google.mlkit.vision.text.Text> {
    private final android.content.Context context = null;
    private final com.google.mlkit.vision.text.TextRecognizer textRecognizer = null;
    private final boolean shouldGroupRecognizedTextInBlocks = false;
    private final boolean showLanguageTag = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.vision.demo.kotlin.textdetector.TextRecognitionProcessor.Companion Companion = null;
    private static final java.lang.String TAG = "TextRecProcessor";
    @org.jetbrains.annotations.NotNull()
    private static androidx.lifecycle.MutableLiveData<java.lang.Boolean> textDetected;
    
    public TextRecognitionProcessor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.text.TextRecognizerOptionsInterface textRecognizerOptions) {
        super(null);
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.google.android.gms.tasks.Task<com.google.mlkit.vision.text.Text> detectInImage(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.common.InputImage image) {
        return null;
    }
    
    @java.lang.Override()
    protected void onSuccess(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.text.Text text, @org.jetbrains.annotations.NotNull()
    com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay) {
    }
    
    @java.lang.Override()
    protected void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/google/mlkit/vision/demo/kotlin/textdetector/TextRecognitionProcessor$Companion;", "", "()V", "TAG", "", "textDetected", "Landroidx/lifecycle/MutableLiveData;", "", "getTextDetected", "()Landroidx/lifecycle/MutableLiveData;", "setTextDetected", "(Landroidx/lifecycle/MutableLiveData;)V", "logExtrasForTesting", "", "text", "Lcom/google/mlkit/vision/text/Text;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTextDetected() {
            return null;
        }
        
        public final void setTextDetected(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
        }
        
        private final void logExtrasForTesting(com.google.mlkit.vision.text.Text text) {
        }
    }
}