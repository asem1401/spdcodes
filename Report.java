public class Report {
    private final String title;
    private final String content;
    private final String author;
    private final String date;

    private Report(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
        this.date = builder.date;
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    // Вложенный класс Builder
    public static class Builder {
        private String title;
        private String content;
        private String author;
        private String date;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}