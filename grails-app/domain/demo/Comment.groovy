package demo

class Comment {
    String text
    static belongsTo = [asset: Asset]
}
