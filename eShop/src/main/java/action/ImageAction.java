package action;

import org.apache.struts2.interceptor.ServletRequestAware;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ImageAction extends BaseAction implements ServletRequestAware {
    private byte[] imageInByte;
    private String imageId;

    private HttpServletRequest request;

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        request = httpServletRequest;
    }

    public byte[] getCustomImageInBytes() {

        System.out.println("imageId" + imageId);

        BufferedImage originalImage;
        try {
            originalImage = ImageIO.read(getImageFile(this.imageId));
            // convert BufferedImage to byte array
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(originalImage, "jpg", baos);
            baos.flush();
            imageInByte = baos.toByteArray();
            baos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return imageInByte;
    }

    private File getImageFile(String imageId) {
        String filePath ="C:\\Users\\forjava\\IdeaProjects\\eShop\\web\\upload\\";
        File file = new File(filePath+imageId);
        System.out.println(file.toString());
        return file;
    }

    public String getCustomContentType() {
        return "image/jpeg";
    }

    public String getCustomContentDisposition() {
        return "anyname.jpg";
    }
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
