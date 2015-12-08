.class public Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;
.super Ljava/lang/Object;
.source "Pathfinder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/Pathfinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PathElement"
.end annotation


# static fields
.field public static final SHORTEST_PREFIX:I = 0x1

.field public static final ZERO_LENGTH_PREFIX:I


# instance fields
.field public final contentDescription:Ljava/lang/String;

.field public final index:I

.field public final prefix:I

.field public final tag:Ljava/lang/String;

.field public final viewClassName:Ljava/lang/String;

.field public final viewId:I


# direct methods
.method public constructor <init>(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "usePrefix"    # I
    .param p2, "vClass"    # Ljava/lang/String;
    .param p3, "ix"    # I
    .param p4, "vId"    # I
    .param p5, "cDesc"    # Ljava/lang/String;
    .param p6, "vTag"    # Ljava/lang/String;

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput p1, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->prefix:I

    .line 57
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->viewClassName:Ljava/lang/String;

    .line 58
    iput p3, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->index:I

    .line 59
    iput p4, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->viewId:I

    .line 60
    iput-object p5, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->contentDescription:Ljava/lang/String;

    .line 61
    iput-object p6, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->tag:Ljava/lang/String;

    .line 62
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 67
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 68
    .local v1, "ret":Lorg/json/JSONObject;
    iget v2, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->prefix:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 69
    const-string v2, "prefix"

    const-string v3, "shortest"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    :cond_0
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->viewClassName:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 72
    const-string v2, "view_class"

    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->viewClassName:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    :cond_1
    iget v2, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->index:I

    if-le v2, v4, :cond_2

    .line 75
    const-string v2, "index"

    iget v3, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->index:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 77
    :cond_2
    iget v2, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->viewId:I

    if-le v2, v4, :cond_3

    .line 78
    const-string v2, "id"

    iget v3, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->viewId:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 80
    :cond_3
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->contentDescription:Ljava/lang/String;

    if-eqz v2, :cond_4

    .line 81
    const-string v2, "contentDescription"

    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->contentDescription:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    :cond_4
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->tag:Ljava/lang/String;

    if-eqz v2, :cond_5

    .line 84
    const-string v2, "tag"

    iget-object v3, p0, Lcom/mixpanel/android/viewcrawler/Pathfinder$PathElement;->tag:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 86
    :cond_5
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    return-object v2

    .line 87
    .end local v1    # "ret":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 88
    .local v0, "e":Lorg/json/JSONException;
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Can\'t serialize PathElement to String"

    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method
