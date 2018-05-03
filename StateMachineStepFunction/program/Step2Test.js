exports.handler = (event, context, callback) => {
    // Take the data from step 1 and modify, send to standard output
    var comment = event.Comment ;
    comment = { 
        "Comment": comment + " .. and digested by step 2." ,
    }
    callback(null, comment);
};
