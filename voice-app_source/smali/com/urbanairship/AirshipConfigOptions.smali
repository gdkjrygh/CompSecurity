.class public Lcom/urbanairship/AirshipConfigOptions;
.super Lcom/urbanairship/Options;
.source "AirshipConfigOptions.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/urbanairship/AirshipConfigOptions$TransportType;
    }
.end annotation


# instance fields
.field public analyticsEnabled:Z
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "analyticsEnabled"
    .end annotation
.end field

.field public analyticsServer:Ljava/lang/String;
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "analyticsServer"
    .end annotation
.end field

.field public developmentAppKey:Ljava/lang/String;
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "developmentAppKey"
    .end annotation
.end field

.field public developmentAppSecret:Ljava/lang/String;
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "developmentAppSecret"
    .end annotation
.end field

.field public developmentLogLevel:I
    .annotation runtime Lcom/urbanairship/ConstantClass;
        name = "android.util.Log"
    .end annotation

    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "developmentLogLevel"
    .end annotation
.end field

.field public gcmSender:Ljava/lang/String;
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "gcmSender"
    .end annotation
.end field

.field public hostURL:Ljava/lang/String;
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "hostURL"
    .end annotation
.end field

.field public inProduction:Z
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "inProduction"
    .end annotation
.end field

.field public landingPageContentURL:Ljava/lang/String;
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "landingPageContentURL"
    .end annotation
.end field

.field public locationOptions:Lcom/urbanairship/LocationOptions;

.field public minSdkVersion:I
    .annotation runtime Lcom/urbanairship/ConstantClass;
        name = "android.os.Build.VERSION_CODES"
    .end annotation

    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "minSdkVersion"
    .end annotation
.end field

.field public productionAppKey:Ljava/lang/String;
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "productionAppKey"
    .end annotation
.end field

.field public productionAppSecret:Ljava/lang/String;
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "productionAppSecret"
    .end annotation
.end field

.field public productionLogLevel:I
    .annotation runtime Lcom/urbanairship/ConstantClass;
        name = "android.util.Log"
    .end annotation

    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "productionLogLevel"
    .end annotation
.end field

.field public pushServiceEnabled:Z
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "pushServiceEnabled"
    .end annotation
.end field

.field public richPushEnabled:Z
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "richPushEnabled"
    .end annotation
.end field

.field public transport:Ljava/lang/String;
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "transport"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 40
    invoke-direct {p0}, Lcom/urbanairship/Options;-><init>()V

    .line 100
    const-string v0, "https://device-api.urbanairship.com/"

    iput-object v0, p0, Lcom/urbanairship/AirshipConfigOptions;->hostURL:Ljava/lang/String;

    .line 106
    const-string v0, "https://combine.urbanairship.com/"

    iput-object v0, p0, Lcom/urbanairship/AirshipConfigOptions;->analyticsServer:Ljava/lang/String;

    .line 112
    const-string v0, "https://dl.urbanairship.com/aaa/"

    iput-object v0, p0, Lcom/urbanairship/AirshipConfigOptions;->landingPageContentURL:Ljava/lang/String;

    .line 133
    iput-boolean v1, p0, Lcom/urbanairship/AirshipConfigOptions;->inProduction:Z

    .line 145
    iput-boolean v2, p0, Lcom/urbanairship/AirshipConfigOptions;->pushServiceEnabled:Z

    .line 153
    iput-boolean v1, p0, Lcom/urbanairship/AirshipConfigOptions;->richPushEnabled:Z

    .line 161
    iput-boolean v2, p0, Lcom/urbanairship/AirshipConfigOptions;->analyticsEnabled:Z

    .line 167
    new-instance v0, Lcom/urbanairship/LocationOptions;

    invoke-direct {v0}, Lcom/urbanairship/LocationOptions;-><init>()V

    iput-object v0, p0, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    .line 181
    const/4 v0, 0x3

    iput v0, p0, Lcom/urbanairship/AirshipConfigOptions;->developmentLogLevel:I

    .line 197
    const/4 v0, 0x6

    iput v0, p0, Lcom/urbanairship/AirshipConfigOptions;->productionLogLevel:I

    .line 205
    const/4 v0, 0x4

    iput v0, p0, Lcom/urbanairship/AirshipConfigOptions;->minSdkVersion:I

    return-void
.end method

.method private isLogLevelValid(I)Z
    .locals 1
    .param p1, "logType"    # I

    .prologue
    .line 337
    packed-switch p1, :pswitch_data_0

    .line 346
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 344
    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    .line 337
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static loadDefaultOptions(Landroid/content/Context;)Lcom/urbanairship/AirshipConfigOptions;
    .locals 2
    .param p0, "ctx"    # Landroid/content/Context;

    .prologue
    .line 221
    new-instance v0, Lcom/urbanairship/AirshipConfigOptions;

    invoke-direct {v0}, Lcom/urbanairship/AirshipConfigOptions;-><init>()V

    .line 222
    .local v0, "options":Lcom/urbanairship/AirshipConfigOptions;
    invoke-virtual {v0, p0}, Lcom/urbanairship/AirshipConfigOptions;->loadFromProperties(Landroid/content/Context;)V

    .line 224
    iget-object v1, v0, Lcom/urbanairship/AirshipConfigOptions;->locationOptions:Lcom/urbanairship/LocationOptions;

    invoke-virtual {v1, p0}, Lcom/urbanairship/LocationOptions;->loadFromProperties(Landroid/content/Context;)V

    .line 226
    return-object v0
.end method


# virtual methods
.method public getAppKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 258
    iget-boolean v0, p0, Lcom/urbanairship/AirshipConfigOptions;->inProduction:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/AirshipConfigOptions;->productionAppKey:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/urbanairship/AirshipConfigOptions;->developmentAppKey:Ljava/lang/String;

    goto :goto_0
.end method

.method public getAppSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 267
    iget-boolean v0, p0, Lcom/urbanairship/AirshipConfigOptions;->inProduction:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/urbanairship/AirshipConfigOptions;->productionAppSecret:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/urbanairship/AirshipConfigOptions;->developmentAppSecret:Ljava/lang/String;

    goto :goto_0
.end method

.method public getDefaultPropertiesFilename()Ljava/lang/String;
    .locals 1

    .prologue
    .line 355
    const-string v0, "airshipconfig.properties"

    return-object v0
.end method

.method public getLoggerLevel()I
    .locals 1

    .prologue
    .line 276
    iget-boolean v0, p0, Lcom/urbanairship/AirshipConfigOptions;->inProduction:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/urbanairship/AirshipConfigOptions;->productionLogLevel:I

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/urbanairship/AirshipConfigOptions;->developmentLogLevel:I

    goto :goto_0
.end method

.method public getTransport()Lcom/urbanairship/AirshipConfigOptions$TransportType;
    .locals 2

    .prologue
    .line 235
    sget-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->GCM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    invoke-virtual {v0}, Lcom/urbanairship/AirshipConfigOptions$TransportType;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/AirshipConfigOptions;->transport:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    sget-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->GCM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    .line 248
    :goto_0
    return-object v0

    .line 239
    :cond_0
    sget-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->HELIUM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    invoke-virtual {v0}, Lcom/urbanairship/AirshipConfigOptions$TransportType;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/AirshipConfigOptions;->transport:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 240
    sget-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->HELIUM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    goto :goto_0

    .line 243
    :cond_1
    sget-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->HYBRID:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    invoke-virtual {v0}, Lcom/urbanairship/AirshipConfigOptions$TransportType;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/urbanairship/AirshipConfigOptions;->transport:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 244
    sget-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->HYBRID:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    goto :goto_0

    .line 248
    :cond_2
    sget-object v0, Lcom/urbanairship/AirshipConfigOptions$TransportType;->GCM:Lcom/urbanairship/AirshipConfigOptions$TransportType;

    goto :goto_0
.end method

.method public isValid()Z
    .locals 12

    .prologue
    const/16 v11, 0x20

    .line 285
    const/4 v8, 0x1

    .line 286
    .local v8, "valid":Z
    new-instance v0, Lcom/urbanairship/AirshipConfigOptions;

    invoke-direct {v0}, Lcom/urbanairship/AirshipConfigOptions;-><init>()V

    .line 288
    .local v0, "aco":Lcom/urbanairship/AirshipConfigOptions;
    iget-boolean v9, p0, Lcom/urbanairship/AirshipConfigOptions;->inProduction:Z

    if-eqz v9, :cond_6

    const-string v6, "production"

    .line 290
    .local v6, "modeString":Ljava/lang/String;
    :goto_0
    invoke-virtual {p0}, Lcom/urbanairship/AirshipConfigOptions;->getAppKey()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_0

    invoke-virtual {p0}, Lcom/urbanairship/AirshipConfigOptions;->getAppKey()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-eqz v9, :cond_0

    invoke-virtual {p0}, Lcom/urbanairship/AirshipConfigOptions;->getAppKey()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v11}, Ljava/lang/String;->indexOf(I)I

    move-result v9

    if-lez v9, :cond_1

    .line 291
    :cond_0
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "AirshipConfigOptions: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {p0}, Lcom/urbanairship/AirshipConfigOptions;->getAppKey()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " is not a valid "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " app key"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 292
    const/4 v8, 0x0

    .line 295
    :cond_1
    invoke-virtual {p0}, Lcom/urbanairship/AirshipConfigOptions;->getAppSecret()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-virtual {p0}, Lcom/urbanairship/AirshipConfigOptions;->getAppSecret()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {p0}, Lcom/urbanairship/AirshipConfigOptions;->getAppSecret()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v11}, Ljava/lang/String;->indexOf(I)I

    move-result v9

    if-lez v9, :cond_3

    .line 296
    :cond_2
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "AirshipConfigOptions: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {p0}, Lcom/urbanairship/AirshipConfigOptions;->getAppSecret()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " is not a valid "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " app secret"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 297
    const/4 v8, 0x0

    .line 301
    :cond_3
    if-nez v8, :cond_4

    .line 304
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    .line 305
    .local v7, "thisClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v7}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    .line 306
    .local v3, "fields":[Ljava/lang/reflect/Field;
    move-object v1, v3

    .local v1, "arr$":[Ljava/lang/reflect/Field;
    array-length v5, v1

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    if-ge v4, v5, :cond_4

    aget-object v2, v1, v4

    .line 307
    .local v2, "field":Ljava/lang/reflect/Field;
    const-class v9, Lcom/urbanairship/PropertyName;

    invoke-virtual {v2, v9}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v9

    if-eqz v9, :cond_7

    .line 322
    .end local v1    # "arr$":[Ljava/lang/reflect/Field;
    .end local v2    # "field":Ljava/lang/reflect/Field;
    .end local v3    # "fields":[Ljava/lang/reflect/Field;
    .end local v4    # "i$":I
    .end local v5    # "len$":I
    .end local v7    # "thisClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_4
    :goto_1
    iget-boolean v9, p0, Lcom/urbanairship/AirshipConfigOptions;->inProduction:Z

    if-eqz v9, :cond_8

    .line 323
    iget v9, p0, Lcom/urbanairship/AirshipConfigOptions;->productionLogLevel:I

    invoke-direct {p0, v9}, Lcom/urbanairship/AirshipConfigOptions;->isLogLevelValid(I)Z

    move-result v9

    if-nez v9, :cond_5

    .line 324
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget v10, p0, Lcom/urbanairship/AirshipConfigOptions;->productionLogLevel:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " is not a valid log level. Falling back to "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    iget v10, v0, Lcom/urbanairship/AirshipConfigOptions;->productionLogLevel:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " ERROR."

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 325
    iget v9, v0, Lcom/urbanairship/AirshipConfigOptions;->productionLogLevel:I

    iput v9, p0, Lcom/urbanairship/AirshipConfigOptions;->productionLogLevel:I

    .line 333
    :cond_5
    :goto_2
    return v8

    .line 288
    .end local v6    # "modeString":Ljava/lang/String;
    :cond_6
    const-string v6, "development"

    goto/16 :goto_0

    .line 310
    .restart local v1    # "arr$":[Ljava/lang/reflect/Field;
    .restart local v2    # "field":Ljava/lang/reflect/Field;
    .restart local v3    # "fields":[Ljava/lang/reflect/Field;
    .restart local v4    # "i$":I
    .restart local v5    # "len$":I
    .restart local v6    # "modeString":Ljava/lang/String;
    .restart local v7    # "thisClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_7
    :try_start_1
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "The public field \'"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "\' is missing an annotation"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 312
    const-string v9, "AirshipConfigOptions appears to be obfuscated. If using Proguard, add the following to your proguard.cfg:"

    invoke-static {v9}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 313
    const-string v9, "\t-keepattributes *Annotation*"

    invoke-static {v9}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 317
    .end local v1    # "arr$":[Ljava/lang/reflect/Field;
    .end local v2    # "field":Ljava/lang/reflect/Field;
    .end local v3    # "fields":[Ljava/lang/reflect/Field;
    .end local v4    # "i$":I
    .end local v5    # "len$":I
    .end local v7    # "thisClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :catch_0
    move-exception v9

    goto :goto_1

    .line 328
    :cond_8
    iget v9, p0, Lcom/urbanairship/AirshipConfigOptions;->developmentLogLevel:I

    invoke-direct {p0, v9}, Lcom/urbanairship/AirshipConfigOptions;->isLogLevelValid(I)Z

    move-result v9

    if-nez v9, :cond_5

    .line 329
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget v10, p0, Lcom/urbanairship/AirshipConfigOptions;->developmentLogLevel:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " is not a valid log level. Falling back to "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    iget v10, v0, Lcom/urbanairship/AirshipConfigOptions;->developmentLogLevel:I

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " DEBUG."

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 330
    iget v9, v0, Lcom/urbanairship/AirshipConfigOptions;->developmentLogLevel:I

    iput v9, p0, Lcom/urbanairship/AirshipConfigOptions;->developmentLogLevel:I

    goto :goto_2
.end method
