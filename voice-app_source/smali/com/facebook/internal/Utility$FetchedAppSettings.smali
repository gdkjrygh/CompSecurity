.class public Lcom/facebook/internal/Utility$FetchedAppSettings;
.super Ljava/lang/Object;
.source "Utility.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/Utility;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FetchedAppSettings"
.end annotation


# instance fields
.field private dialogConfigMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/internal/Utility$DialogFeatureConfig;",
            ">;>;"
        }
    .end annotation
.end field

.field private errorClassification:Lcom/facebook/internal/FacebookRequestErrorClassification;

.field private nuxContent:Ljava/lang/String;

.field private nuxEnabled:Z

.field private supportsImplicitLogging:Z


# direct methods
.method private constructor <init>(ZLjava/lang/String;ZLjava/util/Map;Lcom/facebook/internal/FacebookRequestErrorClassification;)V
    .locals 0
    .param p1, "supportsImplicitLogging"    # Z
    .param p2, "nuxContent"    # Ljava/lang/String;
    .param p3, "nuxEnabled"    # Z
    .param p5, "errorClassification"    # Lcom/facebook/internal/FacebookRequestErrorClassification;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/internal/Utility$DialogFeatureConfig;",
            ">;>;",
            "Lcom/facebook/internal/FacebookRequestErrorClassification;",
            ")V"
        }
    .end annotation

    .prologue
    .line 139
    .local p4, "dialogConfigMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Lcom/facebook/internal/Utility$DialogFeatureConfig;>;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    iput-boolean p1, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->supportsImplicitLogging:Z

    .line 145
    iput-object p2, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->nuxContent:Ljava/lang/String;

    .line 146
    iput-boolean p3, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->nuxEnabled:Z

    .line 147
    iput-object p4, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->dialogConfigMap:Ljava/util/Map;

    .line 148
    iput-object p5, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->errorClassification:Lcom/facebook/internal/FacebookRequestErrorClassification;

    .line 149
    return-void
.end method

.method synthetic constructor <init>(ZLjava/lang/String;ZLjava/util/Map;Lcom/facebook/internal/FacebookRequestErrorClassification;Lcom/facebook/internal/Utility$FetchedAppSettings;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct/range {p0 .. p5}, Lcom/facebook/internal/Utility$FetchedAppSettings;-><init>(ZLjava/lang/String;ZLjava/util/Map;Lcom/facebook/internal/FacebookRequestErrorClassification;)V

    return-void
.end method


# virtual methods
.method public getDialogConfigurations()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/internal/Utility$DialogFeatureConfig;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->dialogConfigMap:Ljava/util/Map;

    return-object v0
.end method

.method public getErrorClassification()Lcom/facebook/internal/FacebookRequestErrorClassification;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->errorClassification:Lcom/facebook/internal/FacebookRequestErrorClassification;

    return-object v0
.end method

.method public getNuxContent()Ljava/lang/String;
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->nuxContent:Ljava/lang/String;

    return-object v0
.end method

.method public getNuxEnabled()Z
    .locals 1

    .prologue
    .line 160
    iget-boolean v0, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->nuxEnabled:Z

    return v0
.end method

.method public supportsImplicitLogging()Z
    .locals 1

    .prologue
    .line 152
    iget-boolean v0, p0, Lcom/facebook/internal/Utility$FetchedAppSettings;->supportsImplicitLogging:Z

    return v0
.end method
