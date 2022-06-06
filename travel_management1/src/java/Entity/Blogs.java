/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Blogs {
    private String BlogId;
    private String Image;
    private String Text;
    private String MarketingId;

    public Blogs(String BlogId, String Image, String Text, String MarketingId) {
        this.BlogId = BlogId;
        this.Image = Image;
        this.Text = Text;
        this.MarketingId = MarketingId;
    }

    public Blogs(String Image, String Text, String MarketingId) {
        this.Image = Image;
        this.Text = Text;
        this.MarketingId = MarketingId;
    }

    public Blogs() {
    }

    public String getBlogId() {
        return BlogId;
    }

    public void setBlogId(String BlogId) {
        this.BlogId = BlogId;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getText() {
        return Text;
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    public String getMarketingId() {
        return MarketingId;
    }

    public void setMarketingId(String MarketingId) {
        this.MarketingId = MarketingId;
    }

    @Override
    public String toString() {
        return "Blogs{" + "BlogId=" + BlogId + ", Image=" + Image + ", Text=" + Text + ", MarketingId=" + MarketingId + '}';
    }
}
