/*
 * Copyright 2011 Future Systems
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.araqne.snmp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.List;

public interface SnmpTrapService {

	List<String> getBindingNames();

	SnmpTrapBinding getBinding(String name);

	SnmpTrapBinding getBinding(InetSocketAddress listenAddress);

	void open(SnmpTrapBinding binding) throws IOException;

	void close(String name) throws IOException;

	void addReceiver(SnmpTrapReceiver callback);

	void removeReceiver(SnmpTrapReceiver callback);
	
	void addReceiver(String name, SnmpTrapReceiver callback);

	void removeReceiver(String name, SnmpTrapReceiver callback);
}
