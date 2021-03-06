/*
 * (C) Copyright 2015 Netcentric AG.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package biz.netcentric.cq.tools.actool.history;

public interface AcHistoryService {

    public void persistHistory(PersistableInstallationLogger history);

    public void persistAcePurgeHistory(PersistableInstallationLogger history);

    public String[] getInstallationLogPaths();

    public String getLastInstallationHistory();

    public String getLogFromHistory(int n, boolean inHtmlFormat);

    public boolean wasLastPersistHistoryCallSuccessful();

}
