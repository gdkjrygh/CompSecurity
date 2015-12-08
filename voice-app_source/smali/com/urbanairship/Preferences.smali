.class public Lcom/urbanairship/Preferences;
.super Ljava/lang/Object;
.source "Preferences.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/Preferences$Preference;
    }
.end annotation


# instance fields
.field private final preferences:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/urbanairship/Preferences$Preference;",
            ">;"
        }
    .end annotation
.end field

.field private resolver:Lcom/urbanairship/PreferencesResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 57
    new-instance v0, Lcom/urbanairship/PreferencesResolver;

    invoke-direct {v0, p1}, Lcom/urbanairship/PreferencesResolver;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/urbanairship/Preferences;-><init>(Lcom/urbanairship/PreferencesResolver;)V

    .line 58
    return-void
.end method

.method constructor <init>(Lcom/urbanairship/PreferencesResolver;)V
    .locals 1
    .param p1, "resolver"    # Lcom/urbanairship/PreferencesResolver;

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/Preferences;->preferences:Ljava/util/Map;

    .line 61
    iput-object p1, p0, Lcom/urbanairship/Preferences;->resolver:Lcom/urbanairship/PreferencesResolver;

    .line 62
    return-void
.end method

.method private getPreference(Ljava/lang/String;)Lcom/urbanairship/Preferences$Preference;
    .locals 3
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 185
    iget-object v2, p0, Lcom/urbanairship/Preferences;->preferences:Ljava/util/Map;

    monitor-enter v2

    .line 186
    :try_start_0
    iget-object v1, p0, Lcom/urbanairship/Preferences;->preferences:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 187
    iget-object v1, p0, Lcom/urbanairship/Preferences;->preferences:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/urbanairship/Preferences$Preference;

    .line 192
    .local v0, "preference":Lcom/urbanairship/Preferences$Preference;
    :goto_0
    monitor-exit v2

    .line 194
    return-object v0

    .line 189
    .end local v0    # "preference":Lcom/urbanairship/Preferences$Preference;
    :cond_0
    new-instance v0, Lcom/urbanairship/Preferences$Preference;

    iget-object v1, p0, Lcom/urbanairship/Preferences;->resolver:Lcom/urbanairship/PreferencesResolver;

    invoke-direct {v0, p1, v1}, Lcom/urbanairship/Preferences$Preference;-><init>(Ljava/lang/String;Lcom/urbanairship/PreferencesResolver;)V

    .line 190
    .restart local v0    # "preference":Lcom/urbanairship/Preferences$Preference;
    iget-object v1, p0, Lcom/urbanairship/Preferences;->preferences:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 192
    .end local v0    # "preference":Lcom/urbanairship/Preferences$Preference;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public getBoolean(Ljava/lang/String;Z)Z
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Z

    .prologue
    .line 72
    invoke-direct {p0, p1}, Lcom/urbanairship/Preferences;->getPreference(Ljava/lang/String;)Lcom/urbanairship/Preferences$Preference;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/Preferences$Preference;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 73
    .local v0, "value":Ljava/lang/String;
    if-nez v0, :cond_0

    .end local p2    # "defaultValue":Z
    :goto_0
    return p2

    .restart local p2    # "defaultValue":Z
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    goto :goto_0
.end method

.method public getFloat(Ljava/lang/String;F)F
    .locals 3
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defaultValue"    # F

    .prologue
    .line 97
    invoke-direct {p0, p1}, Lcom/urbanairship/Preferences;->getPreference(Ljava/lang/String;)Lcom/urbanairship/Preferences$Preference;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/Preferences$Preference;->getValue()Ljava/lang/String;

    move-result-object v1

    .line 98
    .local v1, "value":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 105
    .end local p2    # "defaultValue":F
    :goto_0
    return p2

    .line 103
    .restart local p2    # "defaultValue":F
    :cond_0
    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result p2

    goto :goto_0

    .line 104
    :catch_0
    move-exception v0

    .line 105
    .local v0, "e":Ljava/lang/NumberFormatException;
    goto :goto_0
.end method

.method public getInt(Ljava/lang/String;I)I
    .locals 3
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defaultValue"    # I

    .prologue
    .line 139
    invoke-direct {p0, p1}, Lcom/urbanairship/Preferences;->getPreference(Ljava/lang/String;)Lcom/urbanairship/Preferences$Preference;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/Preferences$Preference;->getValue()Ljava/lang/String;

    move-result-object v1

    .line 140
    .local v1, "value":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 147
    .end local p2    # "defaultValue":I
    :goto_0
    return p2

    .line 145
    .restart local p2    # "defaultValue":I
    :cond_0
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result p2

    goto :goto_0

    .line 146
    :catch_0
    move-exception v0

    .line 147
    .local v0, "e":Ljava/lang/NumberFormatException;
    goto :goto_0
.end method

.method public getLong(Ljava/lang/String;J)J
    .locals 4
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defaultValue"    # J

    .prologue
    .line 118
    invoke-direct {p0, p1}, Lcom/urbanairship/Preferences;->getPreference(Ljava/lang/String;)Lcom/urbanairship/Preferences$Preference;

    move-result-object v2

    invoke-virtual {v2}, Lcom/urbanairship/Preferences$Preference;->getValue()Ljava/lang/String;

    move-result-object v1

    .line 119
    .local v1, "value":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 126
    .end local p2    # "defaultValue":J
    :goto_0
    return-wide p2

    .line 124
    .restart local p2    # "defaultValue":J
    :cond_0
    :try_start_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide p2

    goto :goto_0

    .line 125
    :catch_0
    move-exception v0

    .line 126
    .local v0, "e":Ljava/lang/NumberFormatException;
    goto :goto_0
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Ljava/lang/String;

    .prologue
    .line 84
    invoke-direct {p0, p1}, Lcom/urbanairship/Preferences;->getPreference(Ljava/lang/String;)Lcom/urbanairship/Preferences$Preference;

    move-result-object v1

    invoke-virtual {v1}, Lcom/urbanairship/Preferences$Preference;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 85
    .local v0, "value":Ljava/lang/String;
    if-nez v0, :cond_0

    .end local p2    # "defaultValue":Ljava/lang/String;
    :goto_0
    return-object p2

    .restart local p2    # "defaultValue":Ljava/lang/String;
    :cond_0
    move-object p2, v0

    goto :goto_0
.end method

.method protected migratePreferencesFromFileToDb(Ljava/lang/String;)V
    .locals 13
    .param p1, "filename"    # Ljava/lang/String;

    .prologue
    .line 198
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Migrating "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 199
    const/4 v0, 0x4

    .line 200
    .local v0, "MODE_MULTI_PROCESS":I
    invoke-static {}, Lcom/urbanairship/UAirship;->shared()Lcom/urbanairship/UAirship;

    move-result-object v11

    invoke-virtual {v11}, Lcom/urbanairship/UAirship;->getApplicationContext()Landroid/content/Context;

    move-result-object v11

    invoke-virtual {v11, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    .line 202
    .local v7, "prefs":Landroid/content/SharedPreferences;
    invoke-interface {v7}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v9

    .line 203
    .local v9, "prefsMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;*>;"
    invoke-interface {v9}, Ljava/util/Map;->size()I

    move-result v8

    .line 204
    .local v8, "prefsCount":I
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Found "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " preferences to migrate."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 205
    if-lez v8, :cond_1

    .line 206
    new-array v10, v8, [Landroid/content/ContentValues;

    .line 207
    .local v10, "values":[Landroid/content/ContentValues;
    const/4 v3, 0x0

    .line 208
    .local v3, "i":I
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .local v5, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 209
    .local v2, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;*>;"
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Adding "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, ":"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " to the insert."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 210
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 211
    .local v1, "contentValues":Landroid/content/ContentValues;
    const-string v12, "_id"

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v1, v12, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    const-string v11, "value"

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v11, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    add-int/lit8 v4, v3, 0x1

    .end local v3    # "i":I
    .local v4, "i":I
    aput-object v1, v10, v3

    move v3, v4

    .line 215
    .end local v4    # "i":I
    .restart local v3    # "i":I
    goto :goto_0

    .line 216
    .end local v1    # "contentValues":Landroid/content/ContentValues;
    .end local v2    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;*>;"
    :cond_0
    const-string v11, "Inserting in bulk"

    invoke-static {v11}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 217
    iget-object v11, p0, Lcom/urbanairship/Preferences;->resolver:Lcom/urbanairship/PreferencesResolver;

    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getPreferencesContentUri()Landroid/net/Uri;

    move-result-object v12

    invoke-virtual {v11, v12, v10}, Lcom/urbanairship/PreferencesResolver;->bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I

    move-result v6

    .line 218
    .local v6, "inserted":I
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " rows inserted successfully."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 219
    if-ne v6, v8, :cond_1

    .line 220
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Migration was a success, wiping "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 221
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v11

    invoke-interface {v11}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v11

    invoke-interface {v11}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 224
    .end local v3    # "i":I
    .end local v5    # "i$":Ljava/util/Iterator;
    .end local v6    # "inserted":I
    .end local v10    # "values":[Landroid/content/ContentValues;
    :cond_1
    return-void
.end method

.method public put(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 172
    if-nez p2, :cond_0

    const/4 v0, 0x0

    .line 173
    .local v0, "stringValue":Ljava/lang/String;
    :goto_0
    invoke-direct {p0, p1}, Lcom/urbanairship/Preferences;->getPreference(Ljava/lang/String;)Lcom/urbanairship/Preferences$Preference;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/urbanairship/Preferences$Preference;->setValue(Ljava/lang/String;)Z

    move-result v1

    return v1

    .line 172
    .end local v0    # "stringValue":Ljava/lang/String;
    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public remove(Ljava/lang/String;)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 160
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/urbanairship/Preferences;->put(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
