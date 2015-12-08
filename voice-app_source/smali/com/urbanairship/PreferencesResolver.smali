.class Lcom/urbanairship/PreferencesResolver;
.super Lcom/urbanairship/UrbanAirshipResolver;
.source "PreferencesResolver.java"


# static fields
.field protected static final WHERE_CLAUSE_KEY:Ljava/lang/String; = "_id = ?"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/urbanairship/UrbanAirshipResolver;-><init>(Landroid/content/Context;)V

    .line 14
    return-void
.end method


# virtual methods
.method public get(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 6
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 17
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getPreferencesContentUri()Landroid/net/Uri;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/String;

    const-string v0, "value"

    aput-object v0, v2, v5

    const-string v3, "_id = ?"

    new-array v4, v4, [Ljava/lang/String;

    aput-object p1, v4, v5

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/urbanairship/PreferencesResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public put(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 23
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 24
    .local v0, "values":Landroid/content/ContentValues;
    const-string v1, "_id"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    const-string v1, "value"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getPreferencesContentUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/urbanairship/PreferencesResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v1

    return-object v1
.end method

.method public remove(Ljava/lang/String;)I
    .locals 4
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 30
    invoke-static {}, Lcom/urbanairship/UrbanAirshipProvider;->getPreferencesContentUri()Landroid/net/Uri;

    move-result-object v0

    const-string v1, "_id = ?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p0, v0, v1, v2}, Lcom/urbanairship/PreferencesResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method
