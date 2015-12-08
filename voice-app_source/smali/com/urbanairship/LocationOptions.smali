.class public Lcom/urbanairship/LocationOptions;
.super Lcom/urbanairship/Options;
.source "LocationOptions.java"


# static fields
.field private static final MAX_BG_REPORTING_INTERVAL_SECONDS:I = 0x15180

.field private static final MAX_UPDATE_INTERVAL_METERS:I = 0x186a0

.field private static final MAX_UPDATE_INTERVAL_SECONDS:I = 0x15180

.field private static final MIN_BG_REPORTING_INTERVAL_SECONDS:I = 0x3c

.field private static final MIN_UPDATE_INTERVAL_METERS:I = 0xa

.field private static final MIN_UPDATE_INTERVAL_SECONDS:I = 0x3c


# instance fields
.field public accuracy:I
    .annotation runtime Lcom/urbanairship/ConstantClass;
        name = "android.location.Criteria"
    .end annotation

    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "accuracy"
    .end annotation
.end field

.field public allowGPSForLocationTracking:Z
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "allowGPSForLocationTracking"
    .end annotation
.end field

.field public altitudeRequired:Z
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "altitudeRequired"
    .end annotation
.end field

.field public backgroundReportingIntervalSeconds:J
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "backgroundReportingIntervalSeconds"
    .end annotation
.end field

.field public bearingRequired:Z
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "bearingRequired"
    .end annotation
.end field

.field public costAllowed:Z
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "costAllowed"
    .end annotation
.end field

.field public horizontalAccuracy:I
    .annotation runtime Lcom/urbanairship/ConstantClass;
        name = "android.location.Criteria"
    .end annotation

    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "horizontalAccuracy"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public locationServiceEnabled:Z
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "locationServiceEnabled"
    .end annotation
.end field

.field public powerRequirement:I
    .annotation runtime Lcom/urbanairship/ConstantClass;
        name = "android.location.Criteria"
    .end annotation

    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "powerRequirement"
    .end annotation
.end field

.field public speedRequired:Z
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "speedRequired"
    .end annotation
.end field

.field public updateIntervalMeters:I
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "updateIntervalMeters"
    .end annotation
.end field

.field public updateIntervalSeconds:J
    .annotation runtime Lcom/urbanairship/PropertyName;
        name = "updateIntervalSeconds"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x384

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 39
    invoke-direct {p0}, Lcom/urbanairship/Options;-><init>()V

    .line 64
    iput-boolean v1, p0, Lcom/urbanairship/LocationOptions;->locationServiceEnabled:Z

    .line 74
    iput-boolean v2, p0, Lcom/urbanairship/LocationOptions;->allowGPSForLocationTracking:Z

    .line 80
    const/16 v0, 0x1f4

    iput v0, p0, Lcom/urbanairship/LocationOptions;->updateIntervalMeters:I

    .line 86
    iput-wide v4, p0, Lcom/urbanairship/LocationOptions;->updateIntervalSeconds:J

    .line 93
    iput-wide v4, p0, Lcom/urbanairship/LocationOptions;->backgroundReportingIntervalSeconds:J

    .line 105
    const/4 v0, 0x2

    iput v0, p0, Lcom/urbanairship/LocationOptions;->accuracy:I

    .line 114
    iput v1, p0, Lcom/urbanairship/LocationOptions;->horizontalAccuracy:I

    .line 129
    iput v2, p0, Lcom/urbanairship/LocationOptions;->powerRequirement:I

    .line 138
    iput-boolean v1, p0, Lcom/urbanairship/LocationOptions;->altitudeRequired:Z

    .line 146
    iput-boolean v1, p0, Lcom/urbanairship/LocationOptions;->bearingRequired:Z

    .line 154
    iput-boolean v1, p0, Lcom/urbanairship/LocationOptions;->speedRequired:Z

    .line 162
    iput-boolean v1, p0, Lcom/urbanairship/LocationOptions;->costAllowed:Z

    return-void
.end method

.method private ensureUpdateIntervalValuesAreValid()V
    .locals 8

    .prologue
    const-wide/32 v6, 0x15180

    const-wide/16 v4, 0x3c

    .line 250
    iget-wide v0, p0, Lcom/urbanairship/LocationOptions;->updateIntervalSeconds:J

    cmp-long v0, v0, v4

    if-gez v0, :cond_3

    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The updateIntervalSeconds "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/urbanairship/LocationOptions;->updateIntervalSeconds:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " may decrease battery life."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    .line 255
    :cond_0
    :goto_0
    iget v0, p0, Lcom/urbanairship/LocationOptions;->updateIntervalMeters:I

    const/16 v1, 0xa

    if-ge v0, v1, :cond_4

    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The updateIntervalMeters "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/urbanairship/LocationOptions;->updateIntervalMeters:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " may decrease battery life if the updateIntervalSeconds value is also low."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    .line 260
    :cond_1
    :goto_1
    iget-wide v0, p0, Lcom/urbanairship/LocationOptions;->backgroundReportingIntervalSeconds:J

    cmp-long v0, v0, v4

    if-gez v0, :cond_5

    .line 261
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The backgroundReportingIntervalSeconds "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/urbanairship/LocationOptions;->backgroundReportingIntervalSeconds:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " may decrease battery life."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    .line 265
    :cond_2
    :goto_2
    return-void

    .line 252
    :cond_3
    iget-wide v0, p0, Lcom/urbanairship/LocationOptions;->updateIntervalSeconds:J

    cmp-long v0, v0, v6

    if-lez v0, :cond_0

    .line 253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The updateIntervalSeconds "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/urbanairship/LocationOptions;->updateIntervalSeconds:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " may provide less accurate location updates."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    goto :goto_0

    .line 257
    :cond_4
    iget v0, p0, Lcom/urbanairship/LocationOptions;->updateIntervalMeters:I

    const v1, 0x186a0

    if-le v0, v1, :cond_1

    .line 258
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The updateIntervalMeters "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/urbanairship/LocationOptions;->updateIntervalMeters:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " may provide less accurate location updates."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    goto :goto_1

    .line 262
    :cond_5
    iget-wide v0, p0, Lcom/urbanairship/LocationOptions;->backgroundReportingIntervalSeconds:J

    cmp-long v0, v0, v6

    if-lez v0, :cond_2

    .line 263
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "The backgroundReportingIntervalSeconds "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/urbanairship/LocationOptions;->backgroundReportingIntervalSeconds:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " may provide less detailed analytic reports."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/urbanairship/Logger;->warn(Ljava/lang/String;)V

    goto :goto_2
.end method

.method private isAccuracyValid(I)Z
    .locals 1
    .param p1, "accuracyType"    # I

    .prologue
    .line 227
    packed-switch p1, :pswitch_data_0

    .line 233
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 231
    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    .line 227
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private isPowerReqValid()Z
    .locals 1

    .prologue
    .line 238
    iget v0, p0, Lcom/urbanairship/LocationOptions;->powerRequirement:I

    packed-switch v0, :pswitch_data_0

    .line 245
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 243
    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    .line 238
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static loadDefaultOptions(Landroid/content/Context;)Lcom/urbanairship/LocationOptions;
    .locals 1
    .param p0, "ctx"    # Landroid/content/Context;

    .prologue
    .line 177
    new-instance v0, Lcom/urbanairship/LocationOptions;

    invoke-direct {v0}, Lcom/urbanairship/LocationOptions;-><init>()V

    .line 178
    .local v0, "options":Lcom/urbanairship/LocationOptions;
    invoke-virtual {v0, p0}, Lcom/urbanairship/LocationOptions;->loadFromProperties(Landroid/content/Context;)V

    .line 179
    return-object v0
.end method


# virtual methods
.method public getDefaultPropertiesFilename()Ljava/lang/String;
    .locals 1

    .prologue
    .line 272
    const-string v0, "location.properties"

    return-object v0
.end method

.method public isValid()Z
    .locals 10

    .prologue
    .line 188
    const/4 v7, 0x1

    .line 189
    .local v7, "valid":Z
    new-instance v5, Lcom/urbanairship/LocationOptions;

    invoke-direct {v5}, Lcom/urbanairship/LocationOptions;-><init>()V

    .line 193
    .local v5, "lo":Lcom/urbanairship/LocationOptions;
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    .line 194
    .local v6, "thisClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v6}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    .line 195
    .local v2, "fields":[Ljava/lang/reflect/Field;
    move-object v0, v2

    .local v0, "arr$":[Ljava/lang/reflect/Field;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_0

    aget-object v1, v0, v3

    .line 196
    .local v1, "field":Ljava/lang/reflect/Field;
    const-class v8, Lcom/urbanairship/PropertyName;

    invoke-virtual {v1, v8}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v8

    if-eqz v8, :cond_4

    .line 210
    .end local v0    # "arr$":[Ljava/lang/reflect/Field;
    .end local v1    # "field":Ljava/lang/reflect/Field;
    .end local v2    # "fields":[Ljava/lang/reflect/Field;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    .end local v6    # "thisClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_0
    :goto_1
    iget v8, p0, Lcom/urbanairship/LocationOptions;->accuracy:I

    invoke-direct {p0, v8}, Lcom/urbanairship/LocationOptions;->isAccuracyValid(I)Z

    move-result v8

    if-nez v8, :cond_1

    .line 211
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget v9, p0, Lcom/urbanairship/LocationOptions;->accuracy:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " is not a valid location accuracy requirement. Falling back to "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget v9, v5, Lcom/urbanairship/LocationOptions;->accuracy:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " ACCURACY_COARSE."

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 212
    iget v8, v5, Lcom/urbanairship/LocationOptions;->accuracy:I

    iput v8, p0, Lcom/urbanairship/LocationOptions;->accuracy:I

    .line 214
    :cond_1
    iget v8, p0, Lcom/urbanairship/LocationOptions;->horizontalAccuracy:I

    invoke-direct {p0, v8}, Lcom/urbanairship/LocationOptions;->isAccuracyValid(I)Z

    move-result v8

    if-nez v8, :cond_2

    .line 215
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget v9, p0, Lcom/urbanairship/LocationOptions;->horizontalAccuracy:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " is not a valid location accuracy requirement. Falling back to "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget v9, v5, Lcom/urbanairship/LocationOptions;->horizontalAccuracy:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " NO_REQUIREMENT."

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 216
    iget v8, v5, Lcom/urbanairship/LocationOptions;->horizontalAccuracy:I

    iput v8, p0, Lcom/urbanairship/LocationOptions;->horizontalAccuracy:I

    .line 218
    :cond_2
    invoke-direct {p0}, Lcom/urbanairship/LocationOptions;->isPowerReqValid()Z

    move-result v8

    if-nez v8, :cond_3

    .line 219
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget v9, p0, Lcom/urbanairship/LocationOptions;->powerRequirement:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " is not a valid power requirement. Falling back to "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget v9, v5, Lcom/urbanairship/LocationOptions;->powerRequirement:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " POWER_LOW"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 220
    iget v8, v5, Lcom/urbanairship/LocationOptions;->powerRequirement:I

    iput v8, p0, Lcom/urbanairship/LocationOptions;->powerRequirement:I

    .line 222
    :cond_3
    invoke-direct {p0}, Lcom/urbanairship/LocationOptions;->ensureUpdateIntervalValuesAreValid()V

    .line 223
    return v7

    .line 199
    .restart local v0    # "arr$":[Ljava/lang/reflect/Field;
    .restart local v1    # "field":Ljava/lang/reflect/Field;
    .restart local v2    # "fields":[Ljava/lang/reflect/Field;
    .restart local v3    # "i$":I
    .restart local v4    # "len$":I
    .restart local v6    # "thisClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_4
    :try_start_1
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "The public field \'"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "\' is missing an annotation"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 201
    const-string v8, "LocationOptions appears to be obfuscated. If using Proguard, add the following to your proguard.cfg:"

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V

    .line 202
    const-string v8, "\t-keepattributes *Annotation*"

    invoke-static {v8}, Lcom/urbanairship/Logger;->error(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 203
    const/4 v7, 0x0

    .line 195
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 206
    .end local v0    # "arr$":[Ljava/lang/reflect/Field;
    .end local v1    # "field":Ljava/lang/reflect/Field;
    .end local v2    # "fields":[Ljava/lang/reflect/Field;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    .end local v6    # "thisClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :catch_0
    move-exception v8

    goto/16 :goto_1
.end method
