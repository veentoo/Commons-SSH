/*
 * Copyright 2009-2009 CommonsSSH Project.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.commons.ssh.ganymed;

import net.sf.commons.ssh.ExecSession;
import ch.ethz.ssh2.Session;

/**
 * @since 1.0
 * @author Sergey Vidyuk (svidyuk at gmail dot com)
 */
class GanymedExecSession extends GanymedShellSession implements ExecSession {
    private final Session session;

    GanymedExecSession(final ch.ethz.ssh2.Session session) {
	super(session);

	this.session = session;
    }

    public Integer getExitStatus() {
	return session.getExitStatus();
    }
}
