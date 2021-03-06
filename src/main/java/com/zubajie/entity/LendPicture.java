package com.zubajie.entity;

import java.io.Serializable;

public class LendPicture implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_picture.lend_id
     *
     * @mbg.generated
     */
    private Integer lendId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_picture.photo_url
     *
     * @mbg.generated
     */
    private String photoUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lend_picture
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_picture.lend_id
     *
     * @return the value of lend_picture.lend_id
     *
     * @mbg.generated
     */
    public Integer getLendId() {
        return lendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_picture.lend_id
     *
     * @param lendId the value for lend_picture.lend_id
     *
     * @mbg.generated
     */
    public void setLendId(Integer lendId) {
        this.lendId = lendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_picture.photo_url
     *
     * @return the value of lend_picture.photo_url
     *
     * @mbg.generated
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_picture.photo_url
     *
     * @param photoUrl the value for lend_picture.photo_url
     *
     * @mbg.generated
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lend_picture
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lendId=").append(lendId);
        sb.append(", photoUrl=").append(photoUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}