package com.google.mlkit.vision.demo.kotlin.textdetector;

import java.lang.System;

/**
 * Graphic instance for rendering TextBlock position, size, and ID within an associated graphic
 * overlay view.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/google/mlkit/vision/demo/kotlin/textdetector/TextGraphic;", "Lcom/itpgroup18/groceryhunters/GraphicOverlay$Graphic;", "overlay", "Lcom/itpgroup18/groceryhunters/GraphicOverlay;", "text", "Lcom/google/mlkit/vision/text/Text;", "shouldGroupTextInBlocks", "", "showLanguageTag", "(Lcom/itpgroup18/groceryhunters/GraphicOverlay;Lcom/google/mlkit/vision/text/Text;ZZ)V", "labelPaint", "Landroid/graphics/Paint;", "rectPaint", "textPaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawText", "", "rect", "Landroid/graphics/RectF;", "textHeight", "", "getFormattedText", "languageTag", "Companion", "app_debug"})
public final class TextGraphic extends com.itpgroup18.groceryhunters.GraphicOverlay.Graphic {
    private final com.google.mlkit.vision.text.Text text = null;
    private final boolean shouldGroupTextInBlocks = false;
    private final boolean showLanguageTag = false;
    private final android.graphics.Paint rectPaint = null;
    private final android.graphics.Paint textPaint = null;
    private final android.graphics.Paint labelPaint = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.vision.demo.kotlin.textdetector.TextGraphic.Companion Companion = null;
    private static final java.lang.String TAG = "TextGraphic";
    private static final java.lang.String TEXT_WITH_LANGUAGE_TAG_FORMAT = "%s:%s";
    private static final int TEXT_COLOR = android.graphics.Color.BLACK;
    private static final int MARKER_COLOR = android.graphics.Color.WHITE;
    private static final float TEXT_SIZE = 54.0F;
    private static final float STROKE_WIDTH = 4.0F;
    
    public TextGraphic(@org.jetbrains.annotations.Nullable()
    com.itpgroup18.groceryhunters.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.text.Text text, boolean shouldGroupTextInBlocks, boolean showLanguageTag) {
        super(null);
    }
    
    /**
     * Draws the text block annotations for position, size, and raw value on the supplied canvas.
     */
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final java.lang.String getFormattedText(java.lang.String text, java.lang.String languageTag) {
        return null;
    }
    
    private final void drawText(java.lang.String text, android.graphics.RectF rect, float textHeight, android.graphics.Canvas canvas) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/google/mlkit/vision/demo/kotlin/textdetector/TextGraphic$Companion;", "", "()V", "MARKER_COLOR", "", "STROKE_WIDTH", "", "TAG", "", "TEXT_COLOR", "TEXT_SIZE", "TEXT_WITH_LANGUAGE_TAG_FORMAT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}