package com.Pedrum.StoryFinderFinale.models;





public class Event {



    private long created;
    private int duration;
    private FeeBean fee;
    private String id;
    private String name;
    private int rsvp_limit;
    private String status;
    private long time;
    private long updated;
    private int utc_offset;
    private int waitlist_count;
    private int yes_rsvp_count;
    private GroupBean group;
    private String link;
    private String description;
    private String visibility;

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public FeeBean getFee() {
        return fee;
    }

    public void setFee(FeeBean fee) {
        this.fee = fee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRsvp_limit() {
        return rsvp_limit;
    }

    public void setRsvp_limit(int rsvp_limit) {
        this.rsvp_limit = rsvp_limit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public int getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(int utc_offset) {
        this.utc_offset = utc_offset;
    }

    public int getWaitlist_count() {
        return waitlist_count;
    }

    public void setWaitlist_count(int waitlist_count) {
        this.waitlist_count = waitlist_count;
    }

    public int getYes_rsvp_count() {
        return yes_rsvp_count;
    }

    public void setYes_rsvp_count(int yes_rsvp_count) {
        this.yes_rsvp_count = yes_rsvp_count;
    }

    public GroupBean getGroup() {
        return group;
    }

    public void setGroup(GroupBean group) {
        this.group = group;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public static class FeeBean {


        private String accepts;
        private int amount;
        private String currency;
        private String description;
        private String label;
        private boolean required;

        public String getAccepts() {
            return accepts;
        }

        public void setAccepts(String accepts) {
            this.accepts = accepts;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public boolean isRequired() {
            return required;
        }

        public void setRequired(boolean required) {
            this.required = required;
        }
    }

    public static class GroupBean {


        private long created;
        private String name;
        private int id;
        private String join_mode;
        private double lat;
        private double lon;
        private String urlname;
        private String who;
        private String localized_location;
        private String region;

        public long getCreated() {
            return created;
        }

        public void setCreated(long created) {
            this.created = created;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getJoin_mode() {
            return join_mode;
        }

        public void setJoin_mode(String join_mode) {
            this.join_mode = join_mode;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public String getUrlname() {
            return urlname;
        }

        public void setUrlname(String urlname) {
            this.urlname = urlname;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public String getLocalized_location() {
            return localized_location;
        }

        public void setLocalized_location(String localized_location) {
            this.localized_location = localized_location;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }
}
