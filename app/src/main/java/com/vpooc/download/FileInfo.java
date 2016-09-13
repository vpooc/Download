package com.vpooc.download;

import java.io.Serializable;

/**
 * Created by ChenYao on 2016/9/4.
 */
public class FileInfo implements Serializable{
    private int id;
    private String url;
    private int length;
    private String fileName;
    private int finished;

    public FileInfo(int id, String url, int length, String fileName, int finished) {
        this.id = id;
        this.url = url;
        this.length = length;
        this.fileName = fileName;
        this.finished = finished;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFinished() {
        return finished;
    }

    public void setFinished(int finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", length=" + length +
                ", fileName='" + fileName + '\'' +
                ", finished=" + finished +
                '}';
    }
}
