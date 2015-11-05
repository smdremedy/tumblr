
package com.adaptris.tumblrviewer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Post {

    @SerializedName("blog_name")
    @Expose
    private String blogName;
    @Expose
    private Long id;
    @SerializedName("post_url")
    @Expose
    private String postUrl;
    @Expose
    private String slug;
    @Expose
    private String type;
    @Expose
    private String date;
    @Expose
    private Long timestamp;
    @Expose
    private String state;
    @Expose
    private String format;
    @SerializedName("reblog_key")
    @Expose
    private String reblogKey;
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("short_url")
    @Expose
    private String shortUrl;
    @SerializedName("post_author")
    @Expose
    private String postAuthor;
    @Expose
    private List<Object> highlighted = new ArrayList<Object>();
    @Expose
    private Boolean bookmarklet;
    @SerializedName("note_count")
    @Expose
    private Long noteCount;
    @SerializedName("source_url")
    @Expose
    private String sourceUrl;
    @SerializedName("source_title")
    @Expose
    private String sourceTitle;
    @Expose
    private String caption;
    @SerializedName("link_url")
    @Expose
    private String linkUrl;
    @SerializedName("image_permalink")
    @Expose
    private String imagePermalink;
    @Expose
    private List<Photo> photos = new ArrayList<Photo>();
    @SerializedName("featured_in_tag")
    @Expose
    private List<String> featuredInTag = new ArrayList<String>();

    /**
     * 
     * @return
     *     The blogName
     */
    public String getBlogName() {
        return blogName;
    }

    /**
     * 
     * @param blogName
     *     The blog_name
     */
    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The postUrl
     */
    public String getPostUrl() {
        return postUrl;
    }

    /**
     * 
     * @param postUrl
     *     The post_url
     */
    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestampArrayAdapter<Post> adapter = new ArrayAdapter<Post>(getActivity())
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The format
     */
    public String getFormat() {
        return format;
    }

    /**
     * 
     * @param format
     *     The format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * 
     * @return
     *     The reblogKey
     */
    public String getReblogKey() {
        return reblogKey;
    }

    /**
     * 
     * @param reblogKey
     *     The reblog_key
     */
    public void setReblogKey(String reblogKey) {
        this.reblogKey = reblogKey;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The shortUrl
     */
    public String getShortUrl() {
        return shortUrl;
    }

    /**
     * 
     * @param shortUrl
     *     The short_url
     */
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    /**
     * 
     * @return
     *     The postAuthor
     */
    public String getPostAuthor() {
        return postAuthor;
    }

    /**
     * 
     * @param postAuthor
     *     The post_author
     */
    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    /**
     * 
     * @return
     *     The highlighted
     */
    public List<Object> getHighlighted() {
        return highlighted;
    }

    /**
     * 
     * @param highlighted
     *     The highlighted
     */
    public void setHighlighted(List<Object> highlighted) {
        this.highlighted = highlighted;
    }

    /**
     * 
     * @return
     *     The bookmarklet
     */
    public Boolean getBookmarklet() {
        return bookmarklet;
    }

    /**
     * 
     * @param bookmarklet
     *     The bookmarklet
     */
    public void setBookmarklet(Boolean bookmarklet) {
        this.bookmarklet = bookmarklet;
    }

    /**
     * 
     * @return
     *     The noteCount
     */
    public Long getNoteCount() {
        return noteCount;
    }

    /**
     * 
     * @param noteCount
     *     The note_count
     */
    public void setNoteCount(Long noteCount) {
        this.noteCount = noteCount;
    }

    /**
     * 
     * @return
     *     The sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * 
     * @param sourceUrl
     *     The source_url
     */
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * 
     * @return
     *     The sourceTitle
     */
    public String getSourceTitle() {
        return sourceTitle;
    }

    /**
     * 
     * @param sourceTitle
     *     The source_title
     */
    public void setSourceTitle(String sourceTitle) {
        this.sourceTitle = sourceTitle;
    }

    /**
     * 
     * @return
     *     The caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * 
     * @return
     *     The linkUrl
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * 
     * @param linkUrl
     *     The link_url
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    /**
     * 
     * @return
     *     The imagePermalink
     */
    public String getImagePermalink() {
        return imagePermalink;
    }

    /**
     * 
     * @param imagePermalink
     *     The image_permalink
     */
    public void setImagePermalink(String imagePermalink) {
        this.imagePermalink = imagePermalink;
    }

    /**
     * 
     * @return
     *     The photos
     */
    public List<Photo> getPhotos() {
        return photos;
    }

    /**
     * 
     * @param photos
     *     The photos
     */
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    /**
     * 
     * @return
     *     The featuredInTag
     */
    public List<String> getFeaturedInTag() {
        return featuredInTag;
    }

    /**
     * 
     * @param featuredInTag
     *     The featured_in_tag
     */
    public void setFeaturedInTag(List<String> featuredInTag) {
        this.featuredInTag = featuredInTag;
    }

    @Override
    public String toString() {
        return "Post{" +
                "caption='" + caption + '\'' +
                '}';
    }
}
