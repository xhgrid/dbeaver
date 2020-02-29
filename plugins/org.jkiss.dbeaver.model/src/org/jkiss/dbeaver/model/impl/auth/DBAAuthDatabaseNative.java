/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2020 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jkiss.dbeaver.model.impl.auth;

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.auth.DBAAuthModel;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;

import java.util.Map;

/**
 * Database native auth model.
 *
 * No-op model. Leaves all configuration as is.
 */
public class DBAAuthDatabaseNative implements DBAAuthModel {

    @Override
    public void initAuthentication(DBPConnectionConfiguration configuration, Map<String, Object> authProperties) throws DBException {

    }

    @Override
    public void endAuthentication(DBPConnectionConfiguration configuration, Map<String, Object> authProperties) throws DBException {

    }

}