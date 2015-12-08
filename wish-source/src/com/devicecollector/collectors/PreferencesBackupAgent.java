// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.backup.BackupAgentHelper;
import android.app.backup.SharedPreferencesBackupHelper;

public class PreferencesBackupAgent extends BackupAgentHelper
{

    private static final String PREFS_BACKUP_KEY = "prefs";
    static final String PREFS_FILE = "dc_prefs";

    public PreferencesBackupAgent()
    {
    }

    public void onCreate()
    {
        addHelper("prefs", new SharedPreferencesBackupHelper(this, new String[] {
            "dc_prefs"
        }));
    }
}
