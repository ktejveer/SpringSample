package com.bharati.dairy.example23.mappers;

import com.bharati.dairy.example23.model.Contact;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactMapper implements RowMapper<Contact> {
    @Override
    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
        Contact contact = new Contact();
        contact.setContactId(rs.getInt("contact_id"));
        contact.setName(rs.getString("name"));
        contact.setMobileNumber(rs.getString("mobile_num"));
        contact.setEmail(rs.getString("email"));
        contact.setSubject(rs.getString("subject"));
        contact.setMessage(rs.getString("message"));
        contact.setStatus(rs.getString("status"));
        contact.setCreatedDate(rs.getTimestamp("created_at").toLocalDateTime());
//        contact.setUpdatedDate(rs.getTimestamp("updated_at").toLocalDateTime());
        contact.setCreatedBy(rs.getString("created_by"));
//        contact.setUpdatedBy(rs.getString("update_by"));
        return contact;
    }
}
