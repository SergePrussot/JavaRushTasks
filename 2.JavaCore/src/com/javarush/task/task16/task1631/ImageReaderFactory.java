package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageType) throws IllegalArgumentException {

        if (imageType == null)
            throw new IllegalArgumentException();

        if (imageType.equals(ImageTypes.BMP))
            return new BmpReader();
        else if (imageType.equals(ImageTypes.JPG))
            return new JpgReader();
        else if (imageType.equals(ImageTypes.PNG))
            return new PngReader();
        else throw new IllegalArgumentException();
    }
}
