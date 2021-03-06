/**
 * Copyright 2012 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.windowsazure.services.table.models;

public class QueryTablesOptions extends TableServiceOptions {
    private Filter filter;
    private String nextTableName;
    private String prefix;

    public Filter getFilter() {
        return filter;
    }

    public QueryTablesOptions setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public String getNextTableName() {
        return nextTableName;
    }

    public QueryTablesOptions setNextTableName(String nextTableName) {
        this.nextTableName = nextTableName;
        return this;
    }

    public String getPrefix() {
        return prefix;
    }

    public QueryTablesOptions setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
}
