FROM openjdk:netcat
RUN mkdir -p /usr/local/disambiguation
ADD @project.build.finalName@.jar /usr/local/disambiguation/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
