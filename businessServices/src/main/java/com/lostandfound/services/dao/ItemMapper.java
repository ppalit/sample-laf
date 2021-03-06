package com.lostandfound.services.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lostandfound.common.bean.LocationBean;
import com.lostandfound.common.bean.RegisterItemBean;
import com.lostandfound.common.bean.ReporterBean;

public class ItemMapper implements RowMapper<RegisterItemBean> {

	public RegisterItemBean mapRow(ResultSet rs, int arg1)
			throws SQLException {
		RegisterItemBean item = new RegisterItemBean();
		item.setId(rs.getLong("item_id"));
		item.setCategory(rs.getString("category"));
		item.setFoundDate(rs.getString("item_found_date"));
		item.setItemColor(rs.getString("colour"));
		item.setSubCategory(rs.getString("sub_category"));
		item.setPublicDescription(rs.getString("public_description"));
		item.setSecretDescription(rs.getString("secret_description"));
		
		ReporterBean reporter = new ReporterBean();
		reporter.setEmailId(rs.getString("reporter_id"));
		item.setReporter(reporter);
		
		LocationBean locBean = new LocationBean();
		locBean.setCity(rs.getString("city"));
		locBean.setCountry(rs.getString("country"));
		locBean.setLat(rs.getString("lat"));
		locBean.setLng(rs.getString("lng"));
		locBean.setLocType(rs.getString("loc_type"));
		locBean.setStreetAddress(rs.getString("street_address"));
		locBean.setState(rs.getString("state"));
		item.setLocation(locBean);
		
		
		
		return item;
	}

}
