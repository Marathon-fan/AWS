exports.handler = (event, context, callback) => {
    // Take a var and pass it to step 2
    var comment = event.Comment ;
    comment = { 
        "Comment": comment + " .. and digested by step 1." ,
    }
    callback(null, comment);
};

