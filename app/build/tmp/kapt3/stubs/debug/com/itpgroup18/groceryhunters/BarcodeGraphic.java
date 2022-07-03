package com.itpgroup18.groceryhunters;

import java.lang.System;

/**
 * Graphic instance for rendering Barcode position and content information in an overlay view.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/itpgroup18/groceryhunters/BarcodeGraphic;", "Lcom/itpgroup18/groceryhunters/GraphicOverlay$Graphic;", "overlay", "Lcom/itpgroup18/groceryhunters/GraphicOverlay;", "barcode", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "(Lcom/itpgroup18/groceryhunters/GraphicOverlay;Lcom/google/mlkit/vision/barcode/common/Barcode;)V", "barcodePaint", "Landroid/graphics/Paint;", "labelPaint", "rectPaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "Companion", "app_debug"})
public final class BarcodeGraphic extends com.itpgroup18.groceryhunters.GraphicOverlay.Graphic {
    private final com.google.mlkit.vision.barcode.common.Barcode barcode = null;
    private final android.graphics.Paint rectPaint = null;
    private final android.graphics.Paint barcodePaint = null;
    private final android.graphics.Paint labelPaint = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.itpgroup18.groceryhunters.BarcodeGraphic.Companion Companion = null;
    private static final int TEXT_COLOR = android.graphics.Color.BLACK;
    private static final int MARKER_COLOR = android.graphics.Color.WHITE;
    private static final float TEXT_SIZE = 54.0F;
    private static final float STROKE_WIDTH = 4.0F;
    
    public BarcodeGraphic(@org.jetbrains.annotations.Nullable()
    com.itpgroup18.groceryhunters.GraphicOverlay overlay, @org.jetbrains.annotations.Nullable()
    com.google.mlkit.vision.barcode.common.Barcode barcode) {
        super(null);
    }
    
    /**
     * Draws the barcode block annotations for position, size, and raw value on the supplied canvas.
     */
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/itpgroup18/groceryhunters/BarcodeGraphic$Companion;", "", "()V", "MARKER_COLOR", "", "STROKE_WIDTH", "", "TEXT_COLOR", "TEXT_SIZE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}