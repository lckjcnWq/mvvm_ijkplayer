package com.example.ffmpeg_lib.video;

/**
 * @description
 */
public class VideoConfig {
    private int previewWidth;
    private int previewHeight;
    private int previewColorFormat;
    private int frameRate;

    public int getPreviewWidth() {
        return previewWidth;
    }

    public void setPreviewWidth(int previewWidth) {
        this.previewWidth = previewWidth;
    }

    public int getPreviewHeight() {
        return previewHeight;
    }

    public void setPreviewHeight(int previewHeight) {
        this.previewHeight = previewHeight;
    }

    public int getPreviewColorFormat() {
        return previewColorFormat;
    }

    public void setPreviewColorFormat(int previewColorFormat) {
        this.previewColorFormat = previewColorFormat;
    }

    public int getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(int frameRate) {
        this.frameRate = frameRate;
    }
}
