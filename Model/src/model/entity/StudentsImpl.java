package model.entity;

import java.math.BigDecimal;

import java.sql.Timestamp;

import model.util.ModelUtil;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 27 19:06:04 EET 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class StudentsImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        StudentId,
        StudentName,
        StudentGendar,
        StudentAddress,
        StudentDob,
        StudentParentName,
        StudentParentEmail,
        StudentParentPhone,
        StudentCreatedDate;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int STUDENTID = AttributesEnum.StudentId.index();
    public static final int STUDENTNAME = AttributesEnum.StudentName.index();
    public static final int STUDENTGENDAR = AttributesEnum.StudentGendar.index();
    public static final int STUDENTADDRESS = AttributesEnum.StudentAddress.index();
    public static final int STUDENTDOB = AttributesEnum.StudentDob.index();
    public static final int STUDENTPARENTNAME = AttributesEnum.StudentParentName.index();
    public static final int STUDENTPARENTEMAIL = AttributesEnum.StudentParentEmail.index();
    public static final int STUDENTPARENTPHONE = AttributesEnum.StudentParentPhone.index();
    public static final int STUDENTCREATEDDATE = AttributesEnum.StudentCreatedDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public StudentsImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.entity.Students");
    }

    /**
     * Gets the attribute value for StudentId, using the alias name StudentId.
     * @return the value of StudentId
     */
    public BigDecimal getStudentId() {
        return (BigDecimal) getAttributeInternal(STUDENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StudentId.
     * @param value value to set the StudentId
     */
    public void setStudentId(BigDecimal value) {
        setAttributeInternal(STUDENTID, value);
    }

    /**
     * Gets the attribute value for StudentName, using the alias name StudentName.
     * @return the value of StudentName
     */
    public String getStudentName() {
        return (String) getAttributeInternal(STUDENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for StudentName.
     * @param value value to set the StudentName
     */
    public void setStudentName(String value) {
        setAttributeInternal(STUDENTNAME, value);
    }

    /**
     * Gets the attribute value for StudentGendar, using the alias name StudentGendar.
     * @return the value of StudentGendar
     */
    public String getStudentGendar() {
        return (String) getAttributeInternal(STUDENTGENDAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for StudentGendar.
     * @param value value to set the StudentGendar
     */
    public void setStudentGendar(String value) {
        setAttributeInternal(STUDENTGENDAR, value);
    }

    /**
     * Gets the attribute value for StudentAddress, using the alias name StudentAddress.
     * @return the value of StudentAddress
     */
    public String getStudentAddress() {
        return (String) getAttributeInternal(STUDENTADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for StudentAddress.
     * @param value value to set the StudentAddress
     */
    public void setStudentAddress(String value) {
        setAttributeInternal(STUDENTADDRESS, value);
    }

    /**
     * Gets the attribute value for StudentDob, using the alias name StudentDob.
     * @return the value of StudentDob
     */
    public Timestamp getStudentDob() {
        return (Timestamp) getAttributeInternal(STUDENTDOB);
    }

    /**
     * Sets <code>value</code> as the attribute value for StudentDob.
     * @param value value to set the StudentDob
     */
    public void setStudentDob(Timestamp value) {
        setAttributeInternal(STUDENTDOB, value);
    }

    /**
     * Gets the attribute value for StudentParentName, using the alias name StudentParentName.
     * @return the value of StudentParentName
     */
    public String getStudentParentName() {
        return (String) getAttributeInternal(STUDENTPARENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for StudentParentName.
     * @param value value to set the StudentParentName
     */
    public void setStudentParentName(String value) {
        setAttributeInternal(STUDENTPARENTNAME, value);
    }

    /**
     * Gets the attribute value for StudentParentEmail, using the alias name StudentParentEmail.
     * @return the value of StudentParentEmail
     */
    public String getStudentParentEmail() {
        return (String) getAttributeInternal(STUDENTPARENTEMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for StudentParentEmail.
     * @param value value to set the StudentParentEmail
     */
    public void setStudentParentEmail(String value) {
        setAttributeInternal(STUDENTPARENTEMAIL, value);
    }

    /**
     * Gets the attribute value for StudentParentPhone, using the alias name StudentParentPhone.
     * @return the value of StudentParentPhone
     */
    public String getStudentParentPhone() {
        return (String) getAttributeInternal(STUDENTPARENTPHONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StudentParentPhone.
     * @param value value to set the StudentParentPhone
     */
    public void setStudentParentPhone(String value) {
        setAttributeInternal(STUDENTPARENTPHONE, value);
    }

    /**
     * Gets the attribute value for StudentCreatedDate, using the alias name StudentCreatedDate.
     * @return the value of StudentCreatedDate
     */
    public Timestamp getStudentCreatedDate() {
        return (Timestamp) getAttributeInternal(STUDENTCREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StudentCreatedDate.
     * @param value value to set the StudentCreatedDate
     */
    public void setStudentCreatedDate(Timestamp value) {
        setAttributeInternal(STUDENTCREATEDDATE, value);
    }


    /**
     * @param studentId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal studentId) {
        return new Key(new Object[] { studentId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        
        setStudentId(ModelUtil.getSequaenceNextVal(getDBTransaction()));
        setStudentGendar("Ч");    
        setStudentCreatedDate(ModelUtil.getCurrentDate());
        
    }
}
