package com.cloud.docsviewer.servlet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;

/**
*
* @author pc
*/
public class ConvertPPT {

/**
* @param args the command line arguments
*/
public void convert(String path) throws FileNotFoundException, IOException {
// TODO code application logic here
FileInputStream is = new FileInputStream(path);
SlideShow ppt = new SlideShow(is);
is.close();

Dimension pgsize = ppt.getPageSize();

Slide[] slide = ppt.getSlides();
for (int i = 0; i < slide.length; i++) {

BufferedImage img = new BufferedImage(pgsize.width, pgsize.height, 1);

Graphics2D graphics = img.createGraphics();
graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
RenderingHints.VALUE_INTERPOLATION_BICUBIC);
graphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,
RenderingHints.VALUE_FRACTIONALMETRICS_ON);

graphics.setColor(Color.white);
graphics.clearRect(0, 0, pgsize.width, pgsize.height);
graphics.fill(new Rectangle2D.Float(0, 0, pgsize.width, pgsize.height));

// render
slide[i].draw(graphics);

// save the output
FileOutputStream out = new FileOutputStream(path +"-"+(i + 1) + ".jpg");
javax.imageio.ImageIO.write(img, "jpg", out);
out.close();
}
}
}
