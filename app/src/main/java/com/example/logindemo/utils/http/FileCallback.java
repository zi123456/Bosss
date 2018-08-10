package com.example.logindemo.utils.http;

import com.lzy.okgo.model.Progress;

public abstract class FileCallback extends JsonCallback {
    @Override
    public void downloadProgress(Progress progress) {//下载进度
        progress(progress.fileName,progress.totalSize,progress.currentSize);
    }

    protected abstract void progress(String fileName, long totalSize, long currentSize);

    @Override
    public void uploadProgress(Progress progress) {//上传进度
        super.uploadProgress(progress);
    }
}
