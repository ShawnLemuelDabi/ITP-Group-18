package com.itpgroup18.groceryhunters.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0003J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\b\u0010 \u001a\u00020\u0018H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/itpgroup18/groceryhunters/ui/MyFoodBuddyScreenThreeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "analysisUseCase", "Landroidx/camera/core/ImageAnalysis;", "binding", "Lcom/itpgroup18/groceryhunters/databinding/ActivityMyFoodBuddyScreenThreeBinding;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraSelector", "Landroidx/camera/core/CameraSelector;", "graphicOverlay", "Lcom/itpgroup18/groceryhunters/GraphicOverlay;", "imageProcessor", "Lcom/itpgroup18/groceryhunters/VisionImageProcessor;", "lensFacing", "", "needUpdateGraphicOverlayImageSourceInfo", "", "previewUseCase", "Landroidx/camera/core/Preview;", "previewView", "Landroidx/camera/view/PreviewView;", "bindAllCameraUseCases", "", "bindAnalysisUseCase", "bindPreviewUseCase", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "app_debug"})
public final class MyFoodBuddyScreenThreeActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.camera.view.PreviewView previewView;
    private com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay;
    private androidx.camera.lifecycle.ProcessCameraProvider cameraProvider;
    private androidx.camera.core.Preview previewUseCase;
    private androidx.camera.core.ImageAnalysis analysisUseCase;
    private com.itpgroup18.groceryhunters.VisionImageProcessor imageProcessor;
    private boolean needUpdateGraphicOverlayImageSourceInfo = false;
    private int lensFacing = androidx.camera.core.CameraSelector.LENS_FACING_BACK;
    private androidx.camera.core.CameraSelector cameraSelector;
    private com.itpgroup18.groceryhunters.databinding.ActivityMyFoodBuddyScreenThreeBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    public MyFoodBuddyScreenThreeActivity() {
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
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void bindAllCameraUseCases() {
    }
    
    private final void bindPreviewUseCase() {
    }
    
    @android.annotation.SuppressLint(value = {"LogNotTimber"})
    private final void bindAnalysisUseCase() {
    }
}