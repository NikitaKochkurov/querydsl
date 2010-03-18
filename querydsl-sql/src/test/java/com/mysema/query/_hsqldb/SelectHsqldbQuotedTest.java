/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query._hsqldb;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.mysema.query.Connections;
import com.mysema.query.SelectBaseTest;
import com.mysema.query.Target;
import com.mysema.query.sql.HSQLDBTemplates;
import com.mysema.testutil.FilteringTestRunner;
import com.mysema.testutil.Label;

/**
 * HsqdlbTest provides
 * 
 * @author tiwe
 * @version $Id$
 */
@RunWith(FilteringTestRunner.class)
@Label(Target.HSQLDB)
public class SelectHsqldbQuotedTest extends SelectBaseTest {

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initHSQL();
    }

    @Before
    public void setUpForTest() {
        dialect = new HSQLDBTemplates(true){
            @Override
            public String quoteTableName(String table){
                return super.quoteTableName(table).toUpperCase();        
            }
            @Override
            public String quoteColumnName(String column){
                return super.quoteColumnName(column).toUpperCase();        
            }
        }.newLineToSingleSpace();
    }

    @Override
    public void limitAndOffset2() throws SQLException {     
        
    }

    @Override
    public void serialization(){
        
    }
    
    @Override
    public void subQueries() throws SQLException {
        
    }
}
