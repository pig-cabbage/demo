package com.zubajie.dao;

import com.zubajie.entity.BorrowPicture;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowPictureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_picture
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("borrowId") Integer borrowId, @Param("photoUrl") String photoUrl);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_picture
     *
     * @mbg.generated
     */
    int insert(BorrowPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_picture
     *
     * @mbg.generated
     */
    List<BorrowPicture> selectAll();
}