package com.bharati.dairy.example23.repository;

import com.bharati.dairy.example23.mappers.ContactMapper;
import com.bharati.dairy.example23.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ContactRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int saveContactMessage(Contact contact){
        String sql = "insert into contact_msg (name, mobile_num, email, subject, message, status, created_at, created_by) " +
                "values(?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, contact.getName(), contact.getMobileNumber(), contact.getEmail(),
                contact.getSubject(), contact.getMessage(), contact.getStatus(), contact.getCreatedDate(),
                contact.getCreatedBy()) ;

    }

    public List<Contact> getAllContacts() {
        String sql = "select * from contact_msg";
        return jdbcTemplate.query(sql, new ContactMapper());
//        return jdbcTemplate.query(sql, new RowMapper<Contact>() {
//            @Override
//            public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
//                    Contact contact = new Contact();
//                    contact.setContactId(rs.getInt("contact_id"));
//                    contact.setName(rs.getString("name"));
//                    contact.setMobileNumber(rs.getString("mobile_num"));
//                    contact.setEmail(rs.getString("email"));
//                    contact.setSubject(rs.getString("subject"));
//                    contact.setMessage(rs.getString("message"));
//                    contact.setStatus(rs.getString("status"));
//                    return contact;
//            }
//        });
    }
}
