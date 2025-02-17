package org.apache.maven.shared.incremental;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Olivier Lamy
 * @since 1.1
 */
public class IncrementalBuildHelperRequest
{
    private Set<File> inputFiles;

    private File outputDirectory;

    private File generatedSourcesDirectory;

    public IncrementalBuildHelperRequest()
    {
        // no op
    }

    public Set<File> getInputFiles()
    {
        if ( inputFiles == null )
        {
            this.inputFiles = new HashSet<>();
        }
        return inputFiles;
    }

    public void setInputFiles( Set<File> inputFiles )
    {
        this.inputFiles = inputFiles;
    }

    public IncrementalBuildHelperRequest inputFiles( Set<File> inputFiles )
    {
        this.inputFiles = inputFiles;
        return this;
    }

    public File getOutputDirectory()
    {
        return outputDirectory;
    }

    public void setOutputDirectory( File outputDirectory )
    {
        this.outputDirectory = outputDirectory;
    }

    public IncrementalBuildHelperRequest outputDirectory( File outputDirectory )
    {
        this.outputDirectory = outputDirectory;
        return this;
    }

    public File getGeneratedSourcesDirectory()
    {
        return generatedSourcesDirectory;
    }

    public void setGeneratedSourcesDirectory( File generatedSourcesDirectory )
    {
        this.generatedSourcesDirectory = generatedSourcesDirectory;
    }

    public IncrementalBuildHelperRequest generatedSourcesDirectory( File generatedSourcesDirectory )
    {
        this.generatedSourcesDirectory = generatedSourcesDirectory;
        return this;
    }
}
