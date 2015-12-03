//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 10:34:35 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for CommentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UsefulCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RoomName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckInTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentInfo", propOrder = {
    "commentId",
    "userId",
    "nickName",
    "content",
    "commentType",
    "usefulCount",
    "created",
    "roomName",
    "checkInTime"
})
public class CommentInfo {

    @JSONField(name = "CommentId")
    protected long commentId;
    @JSONField(name = "UserId")
    protected String userId;
    @JSONField(name = "NickName")
    protected String nickName;
    @JSONField(name = "Content")
    protected String content;
    @JSONField(name = "CommentType")
    protected int commentType;
    @JSONField(name = "UsefulCount")
    protected int usefulCount;
    @JSONField(name = "Created")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date created;
    @JSONField(name = "RoomName")
    protected String roomName;
    @JSONField(name = "CheckInTime")
    protected String checkInTime;

    /**
     * Gets the value of the commentId property.
     * 
     */
    public long getCommentId() {
        return commentId;
    }

    /**
     * Sets the value of the commentId property.
     * 
     */
    public void setCommentId(long value) {
        this.commentId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the commentType property.
     * 
     */
    public int getCommentType() {
        return commentType;
    }

    /**
     * Sets the value of the commentType property.
     * 
     */
    public void setCommentType(int value) {
        this.commentType = value;
    }

    /**
     * Gets the value of the usefulCount property.
     * 
     */
    public int getUsefulCount() {
        return usefulCount;
    }

    /**
     * Sets the value of the usefulCount property.
     * 
     */
    public void setUsefulCount(int value) {
        this.usefulCount = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setCreated(java.util.Date value) {
        this.created = value;
    }

    /**
     * Gets the value of the roomName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets the value of the roomName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomName(String value) {
        this.roomName = value;
    }

    /**
     * Gets the value of the checkInTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInTime() {
        return checkInTime;
    }

    /**
     * Sets the value of the checkInTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInTime(String value) {
        this.checkInTime = value;
    }

}
