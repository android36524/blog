package me.huding.luobo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBlogTags<M extends BaseBlogTags<M>> extends Model<M> implements IBean {

	public void setTagID(java.lang.String tagID) {
		set("tagID", tagID);
	}

	public java.lang.String getTagID() {
		return get("tagID");
	}

	public void setBlogID(java.lang.String blogID) {
		set("blogID", blogID);
	}

	public java.lang.String getBlogID() {
		return get("blogID");
	}

}
