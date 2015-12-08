.class public Lcom/adobe/mobile/AnalyticsWorker$Hit;
.super Ljava/lang/Object;
.source "AnalyticsWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/AnalyticsWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "Hit"
.end annotation


# instance fields
.field identifier:Ljava/lang/String;

.field timestamp:J

.field urlFragment:Ljava/lang/String;


# direct methods
.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 609
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
