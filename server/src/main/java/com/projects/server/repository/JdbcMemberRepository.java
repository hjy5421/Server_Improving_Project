package com.projects.server.repository;

import javax.sql.DataSource;

public class JdbcMemberRepository {
    private final DataSource dataSource;

    public JdbcMemberRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


}
