package com.itpgroup18.groceryhunters;

import java.lang.System;

/**
 * Abstract base class for ML Kit frame processors. Subclasses need to implement {@link
 * #onSuccess(T, FrameMetadata, GraphicOverlay)} to define what they want to with the detection
 * results and {@link #detectInImage(VisionImage)} to specify the detector object.
 *
 * @param <T> The type of the detected feature.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 A*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001AB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010!\u001a\u00020\"H\u0014J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010!\u001a\u00020#H$J\u0012\u0010$\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0014J\u0014\u0010%\u001a\u00020&2\n\u0010\'\u001a\u00060(j\u0002`)H$J\u001d\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00020-H$\u00a2\u0006\u0002\u0010.J\u001a\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u0010,\u001a\u00020-H\u0016J$\u00102\u001a\u00020&2\b\u00103\u001a\u0004\u0018\u00010\u00122\b\u00104\u001a\u0004\u0018\u00010\u00142\u0006\u0010,\u001a\u00020-H\u0016J \u00105\u001a\u00020&2\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u00106\u001a\u00020&2\u0006\u0010!\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0017J\u0010\u00108\u001a\u00020&2\u0006\u0010,\u001a\u00020-H\u0002J8\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010,\u001a\u00020-2\b\u0010:\u001a\u0004\u0018\u0001012\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u0016H\u0002J8\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010!\u001a\u00020#2\u0006\u0010,\u001a\u00020-2\b\u0010:\u001a\u0004\u0018\u0001012\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u0016H\u0002J\b\u0010=\u001a\u00020&H\u0002J>\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000 2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010,\u001a\u00020-2\b\u0010:\u001a\u0004\u0018\u0001012\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u0016H\u0002J\b\u0010@\u001a\u00020&H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lcom/itpgroup18/groceryhunters/VisionProcessorBase;", "T", "Lcom/itpgroup18/groceryhunters/VisionImageProcessor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "activityManager", "Landroid/app/ActivityManager;", "executor", "Lcom/itpgroup18/groceryhunters/ScopedExecutor;", "fpsTimer", "Ljava/util/Timer;", "frameProcessedInOneSecondInterval", "", "framesPerSecond", "isShutdown", "", "latestImage", "Ljava/nio/ByteBuffer;", "latestImageMetaData", "Lcom/itpgroup18/groceryhunters/FrameMetadata;", "maxDetectorMs", "", "maxFrameMs", "minDetectorMs", "minFrameMs", "numRuns", "processingImage", "processingMetaData", "totalDetectorMs", "totalFrameMs", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "image", "Lcom/google/android/odml/image/MlImage;", "Lcom/google/mlkit/vision/common/InputImage;", "isMlImageEnabled", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "results", "graphicOverlay", "Lcom/itpgroup18/groceryhunters/GraphicOverlay;", "(Ljava/lang/Object;Lcom/itpgroup18/groceryhunters/GraphicOverlay;)V", "processBitmap", "bitmap", "Landroid/graphics/Bitmap;", "processByteBuffer", "data", "frameMetadata", "processImage", "processImageProxy", "Landroidx/camera/core/ImageProxy;", "processLatestImage", "requestDetectInImage", "originalCameraImage", "shouldShowFps", "frameStartMs", "resetLatencyStats", "setUpListener", "task", "stop", "Companion", "app_debug"})
public abstract class VisionProcessorBase<T extends java.lang.Object> implements com.itpgroup18.groceryhunters.VisionImageProcessor {
    @org.jetbrains.annotations.NotNull()
    public static final com.itpgroup18.groceryhunters.VisionProcessorBase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MANUAL_TESTING_LOG = "LogTagForTest";
    private static final java.lang.String TAG = "VisionProcessorBase";
    private android.app.ActivityManager activityManager;
    private final java.util.Timer fpsTimer = null;
    private final com.itpgroup18.groceryhunters.ScopedExecutor executor = null;
    private boolean isShutdown = false;
    private int numRuns = 0;
    private long totalFrameMs = 0L;
    private long maxFrameMs = 0L;
    private long minFrameMs = 9223372036854775807L;
    private long totalDetectorMs = 0L;
    private long maxDetectorMs = 0L;
    private long minDetectorMs = 9223372036854775807L;
    private int frameProcessedInOneSecondInterval = 0;
    private int framesPerSecond = 0;
    @androidx.annotation.GuardedBy(value = "this")
    private java.nio.ByteBuffer latestImage;
    @androidx.annotation.GuardedBy(value = "this")
    private com.itpgroup18.groceryhunters.FrameMetadata latestImageMetaData;
    @androidx.annotation.GuardedBy(value = "this")
    private java.nio.ByteBuffer processingImage;
    @androidx.annotation.GuardedBy(value = "this")
    private com.itpgroup18.groceryhunters.FrameMetadata processingMetaData;
    
    public VisionProcessorBase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    public void processBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay) {
    }
    
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized void processByteBuffer(@org.jetbrains.annotations.Nullable()
    java.nio.ByteBuffer data, @org.jetbrains.annotations.Nullable()
    com.itpgroup18.groceryhunters.FrameMetadata frameMetadata, @org.jetbrains.annotations.NotNull()
    com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay) {
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized void processLatestImage(com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay) {
    }
    
    private final void processImage(java.nio.ByteBuffer data, com.itpgroup18.groceryhunters.FrameMetadata frameMetadata, com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay) {
    }
    
    @androidx.camera.core.ExperimentalGetImage()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override()
    public void processImageProxy(@org.jetbrains.annotations.NotNull()
    androidx.camera.core.ImageProxy image, @org.jetbrains.annotations.NotNull()
    com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay) {
    }
    
    private final com.google.android.gms.tasks.Task<T> requestDetectInImage(com.google.mlkit.vision.common.InputImage image, com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay, android.graphics.Bitmap originalCameraImage, boolean shouldShowFps, long frameStartMs) {
        return null;
    }
    
    private final com.google.android.gms.tasks.Task<T> requestDetectInImage(com.google.android.odml.image.MlImage image, com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay, android.graphics.Bitmap originalCameraImage, boolean shouldShowFps, long frameStartMs) {
        return null;
    }
    
    private final com.google.android.gms.tasks.Task<T> setUpListener(com.google.android.gms.tasks.Task<T> task, com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay, android.graphics.Bitmap originalCameraImage, boolean shouldShowFps, long frameStartMs) {
        return null;
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    private final void resetLatencyStats() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract com.google.android.gms.tasks.Task<T> detectInImage(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.common.InputImage image);
    
    @org.jetbrains.annotations.NotNull()
    protected com.google.android.gms.tasks.Task<T> detectInImage(@org.jetbrains.annotations.NotNull()
    com.google.android.odml.image.MlImage image) {
        return null;
    }
    
    protected abstract void onSuccess(T results, @org.jetbrains.annotations.NotNull()
    com.itpgroup18.groceryhunters.GraphicOverlay graphicOverlay);
    
    protected abstract void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e);
    
    protected boolean isMlImageEnabled(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/itpgroup18/groceryhunters/VisionProcessorBase$Companion;", "", "()V", "MANUAL_TESTING_LOG", "", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}