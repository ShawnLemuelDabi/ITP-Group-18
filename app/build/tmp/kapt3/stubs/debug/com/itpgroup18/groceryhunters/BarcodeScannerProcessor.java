package com.itpgroup18.groceryhunters;

import java.lang.System;

/**
 * Barcode Detector Demo.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0014J\u001e\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/itpgroup18/groceryhunters/BarcodeScannerProcessor;", "Lcom/itpgroup18/groceryhunters/VisionProcessorBase;", "", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "barcodeScanner", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "barcodes", "graphicOverlay", "Lcom/itpgroup18/groceryhunters/GraphicOverlay;", "stop", "Companion", "app_debug"})
public final class BarcodeScannerProcessor extends com.itpgroup18.groceryhunters.VisionProcessorBase<java.util.List<? extends com.google.mlkit.vision.barcode.common.Barcode>> {
    private final com.google.mlkit.vision.barcode.BarcodeScanner barcodeScanner = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.itpgroup18.groceryhunters.BarcodeScannerProcessor.Companion Companion = null;
    private static final java.lang.String TAG = "BarcodeProcessor";
    @org.jetbrains.annotations.NotNull()
    private static androidx.lifecycle.MutableLiveData<java.lang.Boolean> barcodeDetected;
    @org.jetbrains.annotations.NotNull()
    private static androidx.lifecycle.MutableLiveData<java.lang.String> barcodeDisplayValue;
    
    public BarcodeScannerProcessor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.google.android.gms.tasks.Task<java.util.List<com.google.mlkit.vision.barcode.common.Barcode>> detectInImage(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.common.InputImage image) {
        return null;
    }
    
    @java.lang.Override()
    protected void onSuccess(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.mlkit.vision.barcode.common.Barcode> barcodes, @org.jetbrains.annotations.NotNull()
    com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay) {
    }
    
    @java.lang.Override()
    protected void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/itpgroup18/groceryhunters/BarcodeScannerProcessor$Companion;", "", "()V", "TAG", "", "barcodeDetected", "Landroidx/lifecycle/MutableLiveData;", "", "getBarcodeDetected", "()Landroidx/lifecycle/MutableLiveData;", "setBarcodeDetected", "(Landroidx/lifecycle/MutableLiveData;)V", "barcodeDisplayValue", "getBarcodeDisplayValue", "setBarcodeDisplayValue", "logExtrasForTesting", "", "barcode", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getBarcodeDetected() {
            return null;
        }
        
        public final void setBarcodeDetected(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.String> getBarcodeDisplayValue() {
            return null;
        }
        
        public final void setBarcodeDisplayValue(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
        }
        
        private final void logExtrasForTesting(com.google.mlkit.vision.barcode.common.Barcode barcode) {
        }
    }
}