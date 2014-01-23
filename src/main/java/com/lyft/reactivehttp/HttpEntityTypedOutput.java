package com.lyft.reactivehttp;

import org.apache.http.HttpEntity;

import java.io.IOException;
import java.io.OutputStream;

public class HttpEntityTypedOutput implements TypedOutput {
    final private HttpEntity entity;

    public HttpEntityTypedOutput(HttpEntity entity) {
        this.entity = entity;
    }

    @Override
    public String mimeType() {
        return entity.getContentType().getName();
    }

    @Override
    public long length() {
        return entity.getContentLength();
    }

    @Override
    public void writeTo(OutputStream out) throws IOException {
        entity.writeTo(out);
    }
}
