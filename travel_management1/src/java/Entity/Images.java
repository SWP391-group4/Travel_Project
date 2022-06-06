/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Images {
    private String ImageId;
    private String TableId;

    public Images() {
    }

    public Images(String ImageId, String TableId) {
        this.ImageId = ImageId;
        this.TableId = TableId;
    }

    public Images(String TableId) {
        this.TableId = TableId;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    public String getTableId() {
        return TableId;
    }

    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    @Override
    public String toString() {
        return "Images{" + "ImageId=" + ImageId + ", TableId=" + TableId + '}';
    }
    
}
