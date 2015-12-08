.class public Lcom/mixpanel/android/mpmetrics/ResourceReader$Ids;
.super Lcom/mixpanel/android/mpmetrics/ResourceReader;
.source "ResourceReader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/ResourceReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Ids"
.end annotation


# instance fields
.field private final mResourcePackageName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 0
    .param p1, "resourcePackageName"    # Ljava/lang/String;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 21
    invoke-direct {p0, p2}, Lcom/mixpanel/android/mpmetrics/ResourceReader;-><init>(Landroid/content/Context;)V

    .line 22
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader$Ids;->mResourcePackageName:Ljava/lang/String;

    .line 23
    invoke-virtual {p0}, Lcom/mixpanel/android/mpmetrics/ResourceReader$Ids;->initialize()V

    .line 24
    return-void
.end method


# virtual methods
.method protected getLocalClassName(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/ResourceReader$Ids;->mResourcePackageName:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ".R$id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getSystemClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 28
    const-class v0, Landroid/R$id;

    return-object v0
.end method
