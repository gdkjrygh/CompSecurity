.class Lcom/urbanairship/Preferences$Preference;
.super Ljava/lang/Object;
.source "Preferences.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/Preferences;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Preference"
.end annotation


# instance fields
.field private volatile isUpdated:Z

.field private final key:Ljava/lang/String;

.field private final resolver:Lcom/urbanairship/PreferencesResolver;

.field private volatile value:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/urbanairship/PreferencesResolver;)V
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "resolver"    # Lcom/urbanairship/PreferencesResolver;

    .prologue
    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 235
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/urbanairship/Preferences$Preference;->isUpdated:Z

    .line 238
    iput-object p1, p0, Lcom/urbanairship/Preferences$Preference;->key:Ljava/lang/String;

    .line 239
    iput-object p2, p0, Lcom/urbanairship/Preferences$Preference;->resolver:Lcom/urbanairship/PreferencesResolver;

    .line 240
    invoke-direct {p0}, Lcom/urbanairship/Preferences$Preference;->registerObserver()V

    .line 241
    return-void
.end method

.method static synthetic access$000(Lcom/urbanairship/Preferences$Preference;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/urbanairship/Preferences$Preference;

    .prologue
    .line 230
    iget-object v0, p0, Lcom/urbanairship/Preferences$Preference;->key:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$102(Lcom/urbanairship/Preferences$Preference;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/urbanairship/Preferences$Preference;
    .param p1, "x1"    # Z

    .prologue
    .line 230
    iput-boolean p1, p0, Lcom/urbanairship/Preferences$Preference;->isUpdated:Z

    return p1
.end method

.method private registerObserver()V
    .locals 4

    .prologue
    .line 305
    new-instance v0, Lcom/urbanairship/Preferences$Preference$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/urbanairship/Preferences$Preference$1;-><init>(Lcom/urbanairship/Preferences$Preference;Landroid/os/Handler;)V

    .line 315
    .local v0, "observer":Landroid/database/ContentObserver;
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getPreferencesContentUri()Landroid/net/Uri;

    move-result-object v2

    iget-object v3, p0, Lcom/urbanairship/Preferences$Preference;->key:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 316
    .local v1, "uri":Landroid/net/Uri;
    iget-object v2, p0, Lcom/urbanairship/Preferences$Preference;->resolver:Lcom/urbanairship/PreferencesResolver;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3, v0}, Lcom/urbanairship/PreferencesResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 317
    return-void
.end method


# virtual methods
.method declared-synchronized getValue()Ljava/lang/String;
    .locals 3

    .prologue
    .line 278
    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/urbanairship/Preferences$Preference;->isUpdated:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_0

    .line 279
    const/4 v0, 0x0

    .line 281
    .local v0, "cursor":Landroid/database/Cursor;
    :try_start_1
    iget-object v1, p0, Lcom/urbanairship/Preferences$Preference;->resolver:Lcom/urbanairship/PreferencesResolver;

    iget-object v2, p0, Lcom/urbanairship/Preferences$Preference;->key:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/urbanairship/PreferencesResolver;->get(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 282
    if-eqz v0, :cond_2

    .line 283
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    iput-object v1, p0, Lcom/urbanairship/Preferences$Preference;->value:Ljava/lang/String;

    .line 284
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/urbanairship/Preferences$Preference;->isUpdated:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 290
    :goto_1
    if-eqz v0, :cond_0

    .line 291
    :try_start_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 296
    .end local v0    # "cursor":Landroid/database/Cursor;
    :cond_0
    iget-object v1, p0, Lcom/urbanairship/Preferences$Preference;->value:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-object v1

    .line 283
    .restart local v0    # "cursor":Landroid/database/Cursor;
    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 286
    :cond_2
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to get preference "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/urbanairship/Preferences$Preference;->key:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " from"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " database. Falling back to cached value."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 290
    :catchall_0
    move-exception v1

    if-eqz v0, :cond_3

    .line 291
    :try_start_4
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 278
    .end local v0    # "cursor":Landroid/database/Cursor;
    :catchall_1
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method declared-synchronized setValue(Ljava/lang/String;)Z
    .locals 4
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 253
    monitor-enter p0

    :try_start_0
    iget-boolean v2, p0, Lcom/urbanairship/Preferences$Preference;->isUpdated:Z

    if-eqz v2, :cond_3

    if-nez p1, :cond_2

    iget-object v2, p0, Lcom/urbanairship/Preferences$Preference;->value:Ljava/lang/String;

    if-nez v2, :cond_3

    .line 254
    :cond_0
    const-string v1, "Preference already up to date"

    invoke-static {v1}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 266
    :cond_1
    :goto_0
    monitor-exit p0

    return v0

    .line 253
    :cond_2
    :try_start_1
    iget-object v2, p0, Lcom/urbanairship/Preferences$Preference;->value:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 258
    :cond_3
    iput-object p1, p0, Lcom/urbanairship/Preferences$Preference;->value:Ljava/lang/String;

    .line 259
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/urbanairship/Preferences$Preference;->isUpdated:Z

    .line 261
    if-nez p1, :cond_4

    .line 262
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Removing preference: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/urbanairship/Preferences$Preference;->key:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 263
    iget-object v2, p0, Lcom/urbanairship/Preferences$Preference;->resolver:Lcom/urbanairship/PreferencesResolver;

    iget-object v3, p0, Lcom/urbanairship/Preferences$Preference;->key:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/urbanairship/PreferencesResolver;->remove(Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 265
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Saving preference: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/urbanairship/Preferences$Preference;->key:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/urbanairship/Logger;->verbose(Ljava/lang/String;)V

    .line 266
    iget-object v2, p0, Lcom/urbanairship/Preferences$Preference;->resolver:Lcom/urbanairship/PreferencesResolver;

    iget-object v3, p0, Lcom/urbanairship/Preferences$Preference;->key:Ljava/lang/String;

    invoke-virtual {v2, v3, p1}, Lcom/urbanairship/PreferencesResolver;->put(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v2

    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 253
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
